package expr;

public class Atribuicao extends Expression {
    Id id;
    Numero value;
    Tipo tipo;

    public Atribuicao(String id, int value) {
        this.id = new Id(id);
        this.value = new Numero(value);
    }

    @Override
    public String toString() {
        return id + " = " + value + "\n";
    }
}
