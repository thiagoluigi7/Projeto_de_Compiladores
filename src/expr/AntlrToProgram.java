package expr;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends GramaticaBaseVisitor<Program> {
    public List<String> semanticErrors;
    public SymbolTable symbolTable;

    @Override
    public Program visitProgram(GramaticaParser.ProgramContext ctx) {

        Program prog = new Program();

        semanticErrors = new ArrayList<>();

        symbolTable = new SymbolTable();

        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors, symbolTable);

        for (int i =0;i<ctx.getChildCount();i++){
            if (i!=ctx.getChildCount()-1){
                prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }
        }

        return prog;
    }
}
