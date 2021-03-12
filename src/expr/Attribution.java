package expr;

public class Attribution extends Expression {
    Id id;
    Number value;
    Type type;

    public Attribution(Id _id, Number _value, Type _type) {
        this.id = _id;
        this.value = _value;
        this.type = _type;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + " = " + value + "\n";
    }
}
