package expression;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends GramaticaBaseVisitor<Program> {

    public ArrayList<Declaration> symbolTable;
    public List<String> semanticError;

    @Override
    public Program visitProgram(GramaticaParser.ProgramContext ctx) {
        Program prog = new Program();

        symbolTable = new ArrayList<>();
        semanticError= new ArrayList<>();

        AntlrToExpression exprVisitor = new AntlrToExpression(semanticError, symbolTable);

        for(int i=0; i < ctx.getChildCount()-1; i++) {
            prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
        }

        return prog;

    }


}
