package expr;

public class Operation extends Expression {
    Atribuicao operand1;
    Atribuicao operand2;
    char operator;

    public Operation(Atribuicao _operando1, Atribuicao _operando2, char _operador) {
        this.operand1 = _operando1;
        this.operand2 = _operando2;
        this.operator = _operador;
    }

    @Override
    public String toString() {
        return operand1 + "" + operator + operand2;
    }
}
