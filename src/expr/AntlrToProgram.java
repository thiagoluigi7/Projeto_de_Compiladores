package expr;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends GramaticaBaseVisitor<Program> {
    public List<String> semanticErrors;
    public SymbleTable symbleTable;

    @Override
    public Program visitPrograma(GramaticaParser.ProgramaContext ctx) {

        Program prog = new Program();

        semanticErrors = new ArrayList<>();

        symbleTable = new SymbleTable();

        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors, symbleTable);

        for (int i =0;i<ctx.getChildCount();i++){
            if (i!=ctx.getChildCount()-1){
                prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
            }
        }

        return prog;
    }
}
