grammar uot;
// parser rules
prog 	:	(usingStatement)* (protoDecs)*;

usingStatement
	:	USING dirname SEMI;
protoDecs
	: 	(modifiers)* PROTOTYPE VALIDNAME protoBody
	;
	
protoBody
	: 	BEGIN protoContents END
	;
	
protoContents
	:	(fieldDecs|methodDecs)*
	;	
fieldDecs
	: 	(modifiers)* yieldtype VALIDNAME (ASSIGN expr)? SEMI
	;

methodDecs
	: 	(modifiers)* yieldtype VALIDNAME formalList (SEMI | BEGIN statementList END)
	;
	
formalList
	: 	LBRACKET ((formal COMMA)* formal)? RBRACKET
	;
formal	:	datatype VALIDNAME;
	
modifiers
	: 	(CONSTANT | VISIBLE | SHIELDED | ONLYONE | HIDDEN)
	;
statementList
	:	(statement)*;
statement
	:	(VALIDNAME ASSIGN|YIELD)? expr SEMI 	// assignment
	|	datatype VALIDNAME (ASSIGN expr)? SEMI // variable declaration
	|	when
	|	aslong
	;
	
when	:	WHEN expr BEGIN whenBody END;
whenBody:	statementList ((ORWHEN expr statementList)* OTHERWISE statementList)?
	;

aslong	:	ASLONG expr BEGIN aslongBody END;
aslongBody
	:	statementList;
expr
  	: 	mult_expr
  	| 	('-'|'+') mult_expr
  	;

mult_expr
  	: 	addsub_expr (( '*' | '/' ) addsub_expr)*
  	;
addsub_expr
  	: 	ineq_expr ( ( '+' | '-' ) ineq_expr )*
  	;

ineq_expr
  	: 	eq_expr (( LESSTHAN | GREATERTHAN | GREATEROREQUAL | LESSOREQUAL ) eq_expr)*
  	;

eq_expr
	: 	and_expr (( IS | ISNOT ) and_expr)*
  	;

and_expr	
	: 	or_expr ( AND or_expr )*
 	;

or_expr	
	: 	main_expr ( OR main_expr )*
 	;

main_expr
	:	(VALIDNAME LBRACKET (expr (COMMA expr)* )? RBRACKET) => VALIDNAME LBRACKET (expr (COMMA expr)* )? RBRACKET
	|	CONST 
 	| 	VALIDNAME
  	| 	(LBRACKET expr RBRACKET)
  	;
	
datatype
	: 	(INTEGER | BOOLEAN | CHARACTER | DOUBLE)
	;

yieldtype
	: 	(NOTHING | datatype)
	;
dirname :	VALIDNAME (FSLASH VALIDNAME)* (FSLASH ASTERISK)?
	;

// Lexer rules
	
CONST:	NUMBER+'.'NUMBER+
	|	NUMBER+('.'(NUMBER)*)?'E'('-'|'+')?NUMBER+ // 2.E+5
	|	NUMBER+
	|	(TRUE|FALSE)
	|	STRING_LITERAL
	;

fragment TRUE	:	'true';
fragment FALSE	:	'false';
FSLASH 	:	'/';
SEMI	:	';';
ASTERISK:	'*';
LBRACKET: 	'(';
COMMA	:	',';
RBRACKET:	')';
ASSIGN  :	'<-';

BEGIN	:	'begin';
END	:	'end';

PROTOTYPE
	:	'prototype';
USING	:	'using';
YIELD	:	'yield';

VISIBLE	:	'visible';
SHIELDED:	'shielded';
ONLYONE	:	'onlyone';
CONSTANT:	'constant';
HIDDEN	:	'hidden';

BOOLEAN	:	'bool';
CHARACTER
	:	'char';
DOUBLE	:	'double';
INTEGER	:	'integer';
NOTHING	:	'nothing';

LESSTHAN:	'lessthan';
LESSOREQUAL
	:	'lessorequal';
GREATERTHAN
	:	'greaterthan';
GREATEROREQUAL
	:	'greaterorequal';
IS	:	'is';
ISNOT	:	'isnot';
AND	:	'and';
OR	:	'or';

ASLONG	:	'aslong';
WHEN	:	'when';
ORWHEN	:	'orwhen';
OTHERWISE
	:	'otherwise';
	
WS 	: 
		( '\t' | ' ' | '\r' | '\n' )+ { skip(); } ;

fragment NUMBER	
	: 	'0'..'9' ;

fragment CHAR
	:	'A'..'Z' 
	| 	'a'..'z' ;
fragment STRING_LITERAL
	:	'"'~('"')*'"';
/* python-style comments
COMMENT
    :   '#' ~( '\r'|'\n' )*  ( '\r\n' | '\n' | '\r' ) { skip(); }
    |   '#' ~( '\r'|'\n' )* { skip(); }
    ;*/
VALIDNAME
	: 	CHAR (CHAR|NUMBER)*;

