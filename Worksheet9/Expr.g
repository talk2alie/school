grammar Expr;

// Lexer specification

fragment LETTER	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	:	'0'..'9';
ID				:	LETTER (LETTER | DIGIT)*;
NUM				:	DIGIT+;
ADD				:	'+';
SUB				:	'-';
MUL				:	'*';
DIV				:	'/';
LPAR				:	'(';
RPAR				:	')';
WS				:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

// Parser specification
input			:	expr EOF	;
expr		returns [Expr value]
				:   left=term {$value = $left.value;} (ADD right=term {$value = new PlusExpr($left.value, $right.value);} 
					| SUB right=term {$value = new MinusExpr($left.value, $right.value);})*; 
term		returns [Expr value]			
				:   	left=factor {$value = $left.value;} (MUL right=factor {$value = new TimesExpr($left.value, $right.value);} 
					| DIV right=factor {$value = new DivideExpr($left.value, $right.value);})*;
factor	returns [NumExpr value]
				:   	NUM {$value = new NumExpr(Integer.parseInt($NUM.text));};
