package expression;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AntlrToExpression extends GramaticaBaseVisitor<Expression> {

    /*
     * Semantic Errors:
     * (1) Duplicate variable declaration;
     * (2) Variable not declared.
     * (3) Type conflict
     * */
    private List<String> semanticErrors;
    private ArrayList<Declaration> symbolTable;

    public AntlrToExpression(List<String> semanticErrors, ArrayList<Declaration> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public Expression visitDeclaration(GramaticaParser.DeclarationContext ctx) {
        Token token = ctx.TYPE().getSymbol();
        int line = token.getLine();
        int column = token.getCharPositionInLine();
        String type = ctx.TYPE().getText();
        String id = ctx.ID().getText();
        String value = ctx.NUM().getText();

//         System.out.println("Visitou Declaration");
//         System.out.println(id + " " + type + " " + value);

        Declaration decl = new Declaration(id, type);
        String expectedType;
        if (value.matches("[0-9]*\\.[0-9]+")) {
            expectedType = "float";
            decl.fvalue = Float.parseFloat(value);
        } else {
            expectedType = "int";
            decl.ivalue = Integer.parseInt(value);
        }

        if (!Objects.equals(type, expectedType)) {
            semanticErrors.add("Error: Variable " + id + " is " + type + ", but the value attributed to it is "
                    + expectedType + " (line: " + line + ", Column: " + column + "). " +
                    "So it won't be added to the symbol table.");
        } else {
            symbolTable.add(decl);
        }

        return decl;
    }


    @Override
    public Expression visitNumber(GramaticaParser.NumberContext ctx) {
        String numtxt = ctx.getChild(0).getText();
        if(numtxt.matches("[-+]?[0-9]*\\.[0-9]+")) {
            return new Number(Float.parseFloat(numtxt));
        } else {
            return new Number(Integer.parseInt(numtxt));
        }

    }

    @Override
    public Expression visitVariable(GramaticaParser.VariableContext ctx) {
        String id=ctx.getChild(0).getText();
        return new Variable(id);
    }

    @Override
    public Expression visitOperation(GramaticaParser.OperationContext ctx) {
        ArrayList<Expression> operands = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i=i+2) {
            operands.add(visit(ctx.getChild(i)));
        }
        for (int i = 0; i < ctx.OPERATOR().size(); i++) {
            operators.add(ctx.OPERATOR(i).getText());
        }

        Operation operation = new Operation(operands, operators);

        // System.out.println(operation);

        return operation;
    }

}
