package expr;

public class Attribution extends Expression {
    private Id id;
    private Number number;
    private Type type;

    public Attribution(Id _id, Number _number, Type _type) {
        this.id = _id;
        this.number = _number;
        this.type = _type;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tValue: " + number + "\tType: " + type + "\n";
    }
}
