// Define a grammar called Hello
grammar CPPgrammar;

options
{
    language = Java;
}

//parser

expr:
    typing
    |printing
    |assignment
    |boperation
    |operation
    |structuring
    |LBR expr RBR
    |LKR expr RKR
    |VALUE
    |ID
    |INNER;

block: expr+;

inbrackets: (LKR expr* RKR TZ);

declaring: (TYPE ID TZ)|(TYPE ID ASSIGN VALUE TZ);

/*boperation:((ID|VALUE|INNER) BOPERATOR (ID|VALUE|INNER|operation)) | (BOOL OPERATOR BOOL);
operation: (ID|VALUE|INNER) OPERATOR (ID|VALUE|INNER|operation);
typing: TYPE ID ASSIGN (VALUE|ID|operation|declaring|boperation);
assignment: (ID|INNER) ASSIGN (boperation|operation|VALUE|ID|INNER);
printing: PRINT expr;
structuring: STRUCT ID inbrackets;
declaring: ID LBR RBR;*/

OPERATOR:
    PLUS
    |MINUS
    |MULTIPLYING
    |DIVISION
    |PLUSASS
    |MULTASS
    |ASSIGN;

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
    |TDOUBLE;

//KEYWORDS

STRUCT: 'struct';
TDOUBLE: 'double';
TBOOL: 'bool';
TSTRING: 'string';
PRINT: 'print';


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

DOUBLE: '-'? [0-9]+ '.'?[0-9]+?;
BOOL: 'true'|'false';
INNER: ID DOT ID;
ID: ([a-zA-Z_][a-zA-Z_0-9]*);
STRING: '"'.*?'"';

//OTHER

DOT: '.';
TZ: ';';
QUOTE: '"';
RKR: '}';
LKR: '{';
RBR: ')';
LBR: '(';

WS: [\t\n\r;]+ -> skip;



