grammar ProjLang;

fragment LETTER	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	:	'0'..'9';

SEMI				:	';';
IF				:	'if';
THEN				:	'then';
ELSE				:	'else';
LET				:	'let';
VAL				:	'val';
BIND				:	'=';
LESS				:	'<';
IN				:	'in';
END				:	'end';
FUN				:	'fun';
LPAREN			:	'(';
RPAREN			:	')';
WHILE			:	'while';
DO				:	'do';
LCURLY			:	'{';
RCURLY			:	'}';
NOT				:	'!';
ASSIGN			:	':=';
ADDOP			:	'+' | '-' | '|';
MULOP			:	'*' | '/' | '&';
TRUE				: 	'true';
FALSE			:	'false';
ID				:	LETTER (LETTER | DIGIT)*;
NUM				:	DIGIT+;
WS				:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

input		returns [Expr value]
				:	expr {$value = $expr.value;} SEMI EOF;
expr			returns [Expr value]
				:	IF expr THEN expr ELSE expr
					| LET VAL ID BIND expr IN expr END
					| LET FUN ID LPAREN ID RPAREN BIND expr IN expr END
					| WHILE expr DO expr
					| LCURLY expr (SEMI expr )* RCURLY
					| NOT expr
					| ID ASSIGN expr
					| relexpr;
relexpr			:	arithexpr ((LESS | BIND) arithexpr)?;
arithexpr 		:	term (ADDOP term)*;
term				:	factor (MULOP factor)*;
factor		returns [Expr value]
				:	NUM {$value = new IntConst(Integer.parseInt($NUM.text));}
					| TRUE {$value = new BoolConst(Boolean.parseBoolean(true));}
					| FALSE TRUE {$value = new BoolConst(Boolean.parseBoolean(false));}
					| ID {$value = new VarExpr($ID.text);};
					//| ID LPAREN expr RPAREN
					//| LPAREN expr RPAREN;
