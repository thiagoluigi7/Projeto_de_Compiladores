grammar Gramatica;

@header{
    package antlr;
}

prog: (decl|expr)+ EOF #Program
    ;
decl: TYPE ID'='NUM';'  #Declaration
    ;
expr: expr OPERATOR expr (OPERATOR expr (OPERATOR expr)*)*';'    #Operation
    | NUM               #Number
    | ID                #Variable
    ;

TYPE: ('int'|'float');
OPERATOR: ('+'|'*');
ID:([a-z]|[A-Z])+;
WS:[ \r\t\n]* ->skip;
NUM: [0-9]+('.'[0-9]+)?;