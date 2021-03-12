# Trabalho de Compiladores

Este trabalho se destina a disciplina de Compiladores da UFLA (GCC130-2020/2). <br>

Nele é implementado uma aplicação que realiza a análise sintática de determinado código fonte. Após a análise
a aplicação constrói e imprime uma tabela de símbolos para uma linguagem EXEMPLO.

## Linguagem EXEMPLO

Linguagem EXEMPLO é uma linguagem que processa operações de multiplicação e soma. Cada operação deve ser realizada em uma linha que deve ser encerrada em ponto-e-vírgula (";"). Além disso, a linguagem aceita o uso de variáveis, que devem ser declaradas e inicializadas. As varáveis poem assumir valores numéricos no no formato inteiro (INT) ou real (FLOAT).

Exemplo:

a:INT=1; <br>
b:FLOAT=2; <br>
a+b; <br>
a*b; <br>
2*a+b*3; <br>

## Sobre o projeto

O trabalho é realizado utilizando o Java, o ANTLR e a IDE IntelliJ.

- Java: OpenJDK 15.0.2 <br>
- ANTLR: Antlr 4.9.1-complete.jar <br>
- IntelliJ IDEA: IntelliJ IDEA Community Edition 2020.3.2 <br>

## Sobre o repositório

- Regras de commit: <br>
Todo commit deverá conter um código de emoji seguido da mensagem do commit. Será seguido a convenção do [gitmoji](https://gitmoji.dev/). <br> Ex: 🎉 Início do projeto.
- Uso de branches: <br>
Iremos utilizar apenas a branch ```master```.
- O idioma utilizado no README e na documentação (caso venha a existir uma) é o português brasileiro.  

## Sobre o programa

- A tabela de símbolos conterá as atribuições. <br>
- As operações ficarão na tabela de operações. <br>
- O idioma utilizado no programa é o inglês americano. Sendo assim commits, comentários e classes dentro do programa
assim como todo o código será feito em inglês.