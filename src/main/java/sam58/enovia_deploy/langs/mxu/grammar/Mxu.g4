// НЕ УЧАСТВУЕТ В ПРОЕКТЕ!!!!!!!
grammar Mxu;

//*************************
//****** Lexer rules ******
//*************************
IDENTIFIER
    :   [A-Za-z] [A-Za-z0-9]*
    ;

WHITESPACE
    :   [ \n] -> skip
    ;

//*************************
//***** Parser rules ******
//*************************
MxuFile
    :definition
    ;

definition
    :   upComment | bodyDefinition
    ;

upComment
    :
    ;
bodyDefinition
    :   attributeDefinition
    ;

attributeDefinition
    :   'mxUpdate' 'attribute' '"${NAME}"' '{' attributeBody+ '}'
    ;

attributeBody
    :   ('kind' kindValue) | (symbolicname '""')
