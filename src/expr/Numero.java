package expr;

public class Numero extends Expression{
    int value;


    public Numero(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
