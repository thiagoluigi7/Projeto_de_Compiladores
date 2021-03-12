package expr;

public class Symble {
    private String id;
    private Integer value;
    private String type;

    public Symble(String _id, Integer _value, String _type) {
        this.id = _id;
        this.value = _value;
        this.type = _type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tValue: " + value + "\tType: " + type + "\n";
    }
}
