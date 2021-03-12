package expr;

public class Id extends Expression{
    String name;

    public Id(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
