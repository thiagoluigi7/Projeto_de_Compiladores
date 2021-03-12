package expr;

public class Operation extends Expression {
    Attribution operand1;
    Attribution operand2;
    char operator;
    Id id;

    public Operation(Attribution _operand1, Attribution _operand2, char _operator) {
        this.operand1 = _operand1;
        this.operand2 = _operand2;
        this.operator = _operator;
    }

    public Attribution getOperand1() {
        return operand1;
    }

    public void setOperand1(Attribution operand1) {
        this.operand1 = operand1;
    }

    public Attribution getOperand2() {
        return operand2;
    }

    public void setOperand2(Attribution operand2) {
        this.operand2 = operand2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return operand1 + " " + operator + " " + operand2;
    }

}
