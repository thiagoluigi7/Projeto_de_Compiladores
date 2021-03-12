package expr;

public class Attribution extends Expression {
    Id id;
    Number value;
    Type type;

    public Attribution(String id, int value) {
        this.id = new Id(id);
        this.value = new Number(value);
    }

    @Override
    public String toString() {
        return id + " = " + value + "\n";
    }
}
