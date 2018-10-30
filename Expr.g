grammar Expr;

// Lexer specification

fragment LETTER	
	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	
	:	'0'..'9';
ID	:	LETTER (LETTER | DIGIT)*;
NUM	:	DIGIT+;
ADD	:	'+';
SUB	:	'-';
MUL	:	'*';
DIV	:	'/';
LPAR	:	'(';
RPAR	:	')';
WS	:	(' ' | '\t' | '\n' | '\r')+ { skip(); };

// Parser specification
input	:	expr EOF //EOF is a predefined token
	;
expr	:     	term (ADD term | SUB term)*
	; 
term	:     	factor (MUL factor | DIV factor)*
        ;
factor	:    	LPAR expr RPAR
        | 	ID
        | 	NUM
	;