grammar Gramatica;

@header{
    package antlr;
}

prog: attr+ conta+ EOF        #Program
    ;
attr: ID ':' TIPO '=' NUM ';'    #Attribution
    ;
conta: (ID OPERADOR ID ';') #SingleOperation
    |  ((ID OPERADOR ID) OPERADOR (ID OPERADOR ID))+ #ComplexOperation
    ;

ID: ([a-z]|[A-Z])+;
TIPO: ('INT' | 'FLOAT');
OPERADOR: ('+' | '*');
NUM: [0-9]+;
WS:[ \r\t\n]* ->skip;