// Define a grammar called Hello
grammar CPPgrammar;

options
{
    language = Java;
}

//parser

expr:
    main
    |typing
    |printing
    |assignment
    |declaring
    //|mult_operation
    |operation
    |structuring
    |LBR expr RBR
    |LKR expr RKR
    |VALUE
    |ID
    |INNER;

block: expr+;

declaring: ID ID TZ;
inbrackets: (LKR expr* RKR);
innsqbrackets: LBR expr* RBR;

operation:  mult_operation (OPERATOR_PRIORITY_2 mult_operation)* TZ;
mult_operation : (VALUE|INNER|ID) (OPERATOR_PRIORITY_1(ID|VALUE|INNER))*;

typing: TYPE ID ASSIGN? (VALUE|ID|operation)? TZ? (BR ID ASSIGN? (VALUE|ID|operation)?)* TZ?;
assignment: (ID|INNER) ASSIGN (operation|VALUE|ID|INNER) TZ;
main: TYPE 'main' innsqbrackets inbrackets;
printing: (PRINT innsqbrackets TZ) | (PRINT (VALUE|INNER|ID|innsqbrackets) NLCLEAR? TZ);
structuring: STRUCT ID inbrackets TZ;


/*PERATOR:
    PLUS
    |MINUS
    |MULTIPLYING
    |DIVISION
    |PLUSASS
    |MULTASS;*/

OPERATOR_PRIORITY_1:
    MULTIPLYING
    |DIVISION
    |MULTASS;

OPERATOR_PRIORITY_2:
    PLUS
    |MINUS
    |PLUSASS;

BOPERATOR:
    EQUALS
    |NEQUALS;

VALUE:
    (DOUBLE
    |BOOL
    |STRING);

TYPE:
    TSTRING
    |TBOOL
    |TDOUBLE
    |VOID;

//KEYWORDS

STRUCT: 'struct';
TDOUBLE: 'double';
TBOOL: 'bool';
TSTRING: 'string';
VOID: 'void';
PRINT: 'printf'| 'cout<<' | 'cout <<';
NLCLEAR: '<< endl'|'<<endl';


//OPERATORS

EQUALS: '==';
NEQUALS: '!=';

ASSIGN: '=';
MULTIPLYING: '*';
DIVISION: '/';
PLUS: '+';
MINUS: '-';
PLUSASS: '+=';
MULTASS: '*=';


DOUBLE: '-'? [0-9]+ '.'?[0-9]*;
BOOL: 'true'|'false';
INNER: ID DOT ID (DOT ID)*;
ID: ([a-zA-Z_][a-zA-Z_0-9]*);
OTHERID:([a-zA-Z_][a-zA-Z_0-9]*);
STRING: '"'.*?'"';

//OTHER

DOT: '.';
TZ: ';';
BR: ',';
QUOTE: '"';
RKR: '}';
LKR: '{';
RBR: ')';
LBR: '(';

WS: [ \t\n\r]+ -> skip;



