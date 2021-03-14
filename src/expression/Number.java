package expression;

public class Number extends Expression {
    float fvalue;
    int ivalue;


    public Number(int value) {
        this.ivalue = value;
        this.type = "int";
    }

    public Number(float value) {
        this.fvalue = value;
        this.type = "float";
    }

    @Override
    public String toString() {
        if (type.equals("int")) {
            return Integer.toString(ivalue);
        } else {
            return Float.toString(fvalue);
        }
    }
}
