package expr;

public class Number extends Expression{
    int value;


    public Number(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
