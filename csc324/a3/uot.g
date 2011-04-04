grammar uot;

// parser rules
prog 	:	(useStatements|protoDecs)+;

useStatements
	:	'using' (dirname FSLASH)* (dirname|ASTERISK) SEMI;

protoDecs
	: 	(modifiers)* 'prototype' validName protoBody
	;

protoBody
	: 	BEGIN (methodDecs | fieldDecs)* END
	;
// list of modifiers is not optional is it?
fieldDecs
	: 	(modifiers)+ datatype
	;

methodDecs
	: 	(modifiers)+ yieldtype validName formalList (SEMI | BEGIN statementList END)
	;
	
modifiers
	: 	('visible' | 'shielded' | 'onlyone' | 'constant' | 'hidden')
	;
statementList
	:	(statement)*;
statement
	:	validName ASSIGN expr SEMI 	// assignment
	|	'yield' expr SEMI		// yield
	|	datatype validName (ASSIGN expr)? SEMI // variable declaration
	|	when
	|	aslong
	;
	
when	:	'when' expr BEGIN whenBody END;
whenBody:	statementList (('orwhen' expr statementList)* 'otherwise' statementList)?
	;

aslong	:	'aslong' expr BEGIN aslongBody END;
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
  	: 	eq_expr (( 'lessthan' | 'greaterthan' | 
  		 'greaterorequal' | 'lessorequal' ) eq_expr)*
  	;

eq_expr
	: 	and_expr (( 'is' | 'isnot' ) and_expr)*
  	;

and_expr	
	: 	or_expr ( 'and' or_expr )*
 	;

or_expr	
	: 	main_expr ( 'or' main_expr )*
 	;

main_expr
 	: 	validName 
 	| 	constant 
  	| 	(LBRACKET expr RBRACKET )
  	;

formalList
	: 	LBRACKET (formal COMMA)* RBRACKET
	;
formal	:	datatype validName;
	
datatype
	: 	('integer' | 'bool' | 'char' | 'double')
	;

yieldtype
	: 	('nothing' | datatype)
	;
dirname
	: 	(CHAR | NUMBER | '-' | '_' | '.' | '(' | ')' | '\\\ ')+
	;

validName
	: 	CHAR ( CHAR | NUMBER )*;
	
constant:	NUMBER+'.'NUMBER+
	|	NUMBER+('.'(NUMBER)*)?'E'('-'|'+')?NUMBER+
	|	NUMBER+
	|	(TRUE|FALSE)
	|	STRING_LITERAL
	;

// Lexer rules
FSLASH 	:	'/';
SEMI	:	';';
ASTERISK:	'*';
LBRACKET: 	'(';
COMMA	:	',';
RBRACKET:	')';
ASSIGN  :	'<-';
TRUE	:	'true';
FALSE	:	'false';
BEGIN	:	'begin';
END	:	'end';
	
WS 	: 
		( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ;

NUMBER	: 	(DIGIT)+ ;

fragment DIGIT	
	: 	'0'..'9' ;

CHAR	:	
		( 'A'..'Z' | 'a'..'z' );
STRING_LITERAL
	:	'\"'~('\"')*'\"';
// python-style comments
COMMENT
    :   '#' ~( '\r'|'\n' )*  ( '\r\n' | '\n' | '\r' ) { skip(); }
    |   '#' ~( '\r'|'\n' )* { skip(); }
    ;