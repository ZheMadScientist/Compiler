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
    |mult_operation
    |operation
    |structuring
    |returning
    |declaring
    |LBR expr RBR
    |LKR expr RKR
    |VALUE
    |ID
    |INNER;

block: expr+;

inbrackets: (LKR expr* RKR);
innsqbrackets: LBR expr* RBR;
//operation: (ID|VALUE|INNER) OPERATOR_PRIORITY_2 (ID|VALUE|INNER|operation|multy_operation);

operation:  mult_operation (OPERATOR_PRIORITY_2 mult_operation)*;
mult_operation : (ID|VALUE) (OPERATOR_PRIORITY_1(ID|VALUE))*;

typing: TYPE ID ASSIGN? (VALUE|ID|operation)? (BR ID ASSIGN? (VALUE|ID|operation)?)*;
assignment: (ID|INNER) ASSIGN (operation|VALUE|ID|INNER);
main: TYPE 'main' innsqbrackets inbrackets;
printing: (PRINT innsqbrackets) | (PRINT (VALUE|INNER|ID|innsqbrackets) NLCLEAR?);
structuring: STRUCT ID inbrackets;
returning: RETURN (ID|VALUE|INNER);
declaring: ID ID;

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

RETURN: 'return';

DOUBLE: '-'? [0-9]+ '.'?[0-9]*;
BOOL: 'true'|'false';
INNER: ID DOT ID (DOT ID)*;
ID: ([a-zA-Z_][a-zA-Z_0-9]*);
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

WS: [ \t\n\r;]+ -> skip;



