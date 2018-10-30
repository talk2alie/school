grammar Project;

fragment LETTER	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	:	'0'..'9';

SEMI			:	';';
IF				:	'if';
THEN			:	'then';
ELSE			:	'else';
LET				:	'let';
VAL				:	'val';
BIND			:	'=';
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
RELOP			:	'<' | '=';
ADDOP			:	'+' | '-' | '|';
MULOP			:	'*' | '/' | '&';
TRUE			: 	'true';
FALSE			:	'false';
ID				:	LETTER (LETTER | DIGIT)*;
NUM				:	DIGIT+;
WS				:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

input			:	expr SEMI;
expr			:	IF expr THEN expr ELSE expr
					| LET VAL ID BIND expr IN expr END
					| LET FUN ID LPAREN ID RPAREN BIND expr IN expr END
					| WHILE expr DO expr
					| LCURLY expr (SEMI expr )* RCURLY
					| NOT expr
					| ID ASSIGN expr
					| relexpr;
relexpr			:	arithexpr (RELOP arithexpr)?;
arithexpr 		:	term (ADDOP term)*;
term			:	factor (MULOP factor)*;
factor			:	NUM
					| TRUE
					| FALSE
					| ID
					| ID LPAREN expr RPAREN
					| LPAREN expr RPAREN;
