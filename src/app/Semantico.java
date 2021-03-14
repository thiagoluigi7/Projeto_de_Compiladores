package app;

import antlr.GramaticaLexer;
import antlr.GramaticaParser;
import expression.AntlrToProgram;
import expression.Declaration;
import expression.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Semantico {

    public static void main(String[] args) {
        if(args.length!=1) {
            System.err.println("No input file given.");
        } else {
            String fileName = args[0];
            GramaticaParser parser = getParser(fileName);

            ParseTree ast = parser.prog();

            AntlrToProgram progVisitor = new AntlrToProgram();
            System.out.println("***Visiting AST.");
            Program prog = progVisitor.visit(ast);

            if(progVisitor.semanticError.isEmpty()) {
                System.out.println("Analysis Results: OK.");
            } else {
                System.out.println("Analysis Results: " + progVisitor.semanticError.size() + " errors found.");
                for(String err: progVisitor.semanticError) {
                    System.out.println(err);
                }
            }

            if (progVisitor.symbolTable.isEmpty()) {
                System.out.println("Nothing declared.");
            } else {
                System.out.println("Symbol table: ");
                for (Declaration symbol : progVisitor.symbolTable) {
                    System.out.println(symbol);
                }
            }

        }

    }

    private static GramaticaParser getParser(String fileName) {
        GramaticaParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GramaticaParser(tokens);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parser;
    }

}
