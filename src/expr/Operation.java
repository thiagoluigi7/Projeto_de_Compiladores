package expr;

public class Operation extends Expression {
    Atribuicao operand1;
    Atribuicao operand2;
    char operator;

    public Operation(Atribuicao _operand1, Atribuicao _operand2, char _operator) {
        this.operand1 = _operand1;
        this.operand2 = _operand2;
        this.operator = _operator;
    }

    @Override
    public String toString() {
        return operand1 + "" + operator + operand2;
    }
}
