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
				:	expr {$value = $expr.value;} SEMI EOF
					;
expr			returns [Expr value]
				:	IF condition=expr THEN trueExpr=expr ELSE falseExpr=expr {$value = new IfExpr($condition.value, $trueExpr.value, $falseExpr.value);}
					| LET VAL ID BIND binding=expr IN in=expr END {$value = new LetValExpr($ID.text, $binding.value, $in.value);}
					| LET FUN ID LPAREN ID RPAREN BIND expr IN expr END
					| WHILE condition=expr DO action=expr {$value = new WhileExpr($condition.value, $action.value);}
					| LCURLY first=expr {$value = $first.value;} (SEMI second=expr {$value = new SeqExpr($value, $second.value);})* RCURLY
					| NOT e=expr {$value = new NotExpr($e.value);}
					| ID ASSIGN e=expr {$value = new AssnExpr($ID.text, $e.value);}
					| relexpr {$value = $relexpr.value;}
					;
relexpr		returns [Expr value]
				:	left=arithexpr {$value = $left.value;} (op=(LESS | BIND) right=arithexpr 
					{$value = ($op.text.equals("<")) ? new BinExpr($left.value, BinOp.LT, $right.value) : new BinExpr($left.value, BinOp.EQ, $right.value);})?
					;
arithexpr	returns [Expr value]
		 		:	left=term {$value = $left.value;} (op=ADDOP right=term  
		 			{switch ($op.text) {
			            case "+":
			                $value = new BinExpr($value, BinOp.PLUS, $right.value);
			                break;
			            case "-":
			                $value = new BinExpr($value, BinOp.MINUS, $right.value);
			                break;			            
			            case "|":
			                $value = new BinExpr($value, BinOp.OR, $right.value);
			                break;
			        }})*
			        ;
term			returns [Expr value]
				:	left=factor {$value = $left.value;} (op=MULOP right=factor 
					{switch ($op.text) {
			            case "&":
			                $value = new BinExpr($value, BinOp.AND, $right.value);
			                break;
			            case "/":
			                $value = new BinExpr($value, BinOp.DIV, $right.value);
			                break;			            
			            case "*":
			                $value = new BinExpr($value, BinOp.TIMES, $right.value);
			                break;
			        }})*
			        ;
factor		returns [Expr value]
				:	NUM {$value = new IntConst(Integer.parseInt($NUM.text));}
					| TRUE {$value = new BoolConst(true);}
					| FALSE {$value = new BoolConst(false);}
					| ID {$value = new VarExpr($ID.text);}					
					| ID LPAREN expr RPAREN
					| LPAREN expr {$value = $expr.value;} RPAREN;
