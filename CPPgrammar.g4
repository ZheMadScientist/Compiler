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
    |operation
    |structuring
    |returning
    |LBR expr RBR
    |LKR expr RKR
    |VALUE
    |ID
    |INNER;

block: expr+;

inbrackets: (LKR expr* RKR);
innsqbrackets: LBR expr* RBR;

operation: (ID|VALUE|INNER) OPERATOR (ID|VALUE|INNER|operation);
typing: TYPE ID ASSIGN? (VALUE|ID|operation)? (BR ID ASSIGN? (VALUE|ID|operation)?)*;
assignment: (ID|INNER) ASSIGN (operation|VALUE|ID|INNER);
main: TYPE 'main' innsqbrackets inbrackets;
printing: PRINT innsqbrackets;
structuring: STRUCT ID inbrackets;
returning: RETURN (ID|VALUE|INNER);


OPERATOR:
    PLUS
    |MINUS
    |MULTIPLYING
    |DIVISION
    |PLUSASS
    |MULTASS;

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
PRINT: 'printf'| 'cout << string' | 'cout << double';


//OPERATORS

EQUALS: '==';
NEQUALS: '!=';

ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MULTIPLYING: '*';
DIVISION: '/';
PLUSASS: '+=';
MULTASS: '*=';

RETURN: 'return';

DOUBLE: '-'? [0-9]+ '.'?[0-9]*?;
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
FUNC: 'func';

WS: [\t\n\r;]+ -> skip;



