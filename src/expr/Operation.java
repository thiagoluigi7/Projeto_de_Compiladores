package expr;

public class Operation extends Expression {
    Attribution operand1;
    Attribution operand2;
    char operator;

    public Operation(Attribution _operand1, Attribution _operand2, char _operator) {
        this.operand1 = _operand1;
        this.operand2 = _operand2;
        this.operator = _operator;
    }

    @Override
    public String toString() {
        return operand1 + "" + operator + operand2;
    }
}
