package expr;

public class Tipo extends Expression {
    String tipo;

    public Tipo (String _tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
