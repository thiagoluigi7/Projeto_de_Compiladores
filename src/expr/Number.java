package expr;

public class Number extends Expression {
    private int value;

    public Number(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
