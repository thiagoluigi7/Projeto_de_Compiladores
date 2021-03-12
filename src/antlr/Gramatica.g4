grammar Gramatica;

@header{
    package antlr;
}

prog: attr+ conta+ EOF        #Programa
    ;
attr: ID ':' TIPO '=' NUM ';'    #Atribuicao
    ;
conta: ID OPERADOR ID ';' #Operacao
    ;

ID: ([a-z]|[A-Z])+;
TIPO: ('INT' | 'FLOAT');
OPERADOR: ('+' | '*');
NUM: [0-9]+;
WS:[ \r\t\n]* ->skip;