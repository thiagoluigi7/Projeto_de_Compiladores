package expr;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;

import java.util.ArrayList;
import java.util.List;


public class AntlrToExpression extends GramaticaBaseVisitor<Expression> {
    private List<String> declaredVariables;

    private List<String> semanticErrors;

    private SymbolTable symbolTable;

    private OpTable opTable;

    public AntlrToExpression(List<String> semanticErrors, SymbolTable symbolTable) {
        declaredVariables = new ArrayList<>();
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public Expression visitAttribution(GramaticaParser.AttributionContext ctx) {
        Id id = new Id(ctx.ID().getText());
        Number value = new Number(Integer.parseInt(ctx.NUM().getText()));
        Type type = new Type(ctx.TIPO().getText());
        Attribution attr = new Attribution(id, value, type);
        if (symbolTable.check(id)){
            semanticErrors.add("Variable already declared: " + id.toString());
        } else {
            symbolTable.add(attr);
        }

        return attr;
    }

    @Override
    public Expression visitSingleOperation(GramaticaParser.SingleOperationContext ctx) {
        Operation operation = new Operation(opTable.getOpTableSize());
        for (int i = 0; i < ctx.ID().size(); i++) {
            Id id = new Id(ctx.ID(i).toString());
            operation.setOperand(symbolTable.getAttr(id));
        }

        operation.setOperator(ctx.OPERADOR().getText());

        if(opTable.check(operation.getId())) {
            semanticErrors.add("Variable already declared: " + operation.getId().toString());
        } else {
            opTable.add(operation);
        }

        return operation;

    }

    @Override
    public Expression visitComplexOperation(GramaticaParser.ComplexOperationContext ctx) {
        Operation operation = new Operation(opTable.getOpTableSize());
        for (int i = 0; i < ctx.ID().size(); i++) {
            Id id = new Id(ctx.ID(i).toString());
            operation.setOperand(symbolTable.getAttr(id));
        }

        for (int i = 0; i < ctx.OPERADOR().size(); i++) {
            operation.setOperator(ctx.OPERADOR(i).getText());
        }

        if(opTable.check(operation.getId())) {
            semanticErrors.add("Variable already declared: " + operation.getId().toString());
        } else {
            opTable.add(operation);
        }

        return operation;

    }



}
