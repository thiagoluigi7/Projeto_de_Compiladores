package expr;

public class Type extends Expression {
    String type;

    public Type(String _type) {
        this.type = _type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
