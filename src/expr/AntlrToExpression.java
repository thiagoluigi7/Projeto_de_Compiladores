package expr;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;

import java.util.ArrayList;
import java.util.List;


public class AntlrToExpression extends GramaticaBaseVisitor<Expression> {
    private List<String> declaredVariables;

    private List<String> semanticErrors;

    private SymbleTable symbleTable;

    public AntlrToExpression(List<String> semanticErrors, SymbleTable symbleTable) {
        declaredVariables = new ArrayList<>();
        this.semanticErrors = semanticErrors;
        this.symbleTable=symbleTable;
    }

    @Override
    public Expression visitAtribuicao(GramaticaParser.AtribuicaoContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.NUM().getText();
        Atribuicao attr = new Atribuicao(id,Integer.parseInt(value));
        if (symbleTable.check(id)){
            semanticErrors.add("Variavel já declarada : "+id);
        } else {
            symbleTable.add(id,Integer.parseInt(value));
        }

        return attr;
    }

    // Todo
    @Override
    public Expression visitOperacao(GramaticaParser.OperacaoContext ctx) {


    }



}
