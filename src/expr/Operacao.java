package expr;

public class Operacao extends Expression {
    Atribuicao operando1;
    Atribuicao operando2;
    char operador;

    public Operacao(Atribuicao _operando1, Atribuicao _operando2, char _operador) {
        this.operando1 = _operando1;
        this.operando2 = _operando2;
        this.operador = _operador;
    }

    @Override
    public String toString() {
        return operando1 + "" + operador + operando2;
    }
}
