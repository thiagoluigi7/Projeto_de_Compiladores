package expr;

/**
 * Class used to store an attribution.
 */
public class Attribution extends Expression {
    private Id id;
    private Number number;
    private Type type;

    /**
     * Constructor of the Attribution class.
     * @param _id _id is an Id object
     * @param _number _number is a Number object
     * @param _type _type is a Type object. It can be 'INT' or 'FLOAT'
     */
    public Attribution(Id _id, Number _number, Type _type) {
        this.id = _id;
        this.number = _number;
        this.type = _type;
    }

    /**
     * Returns the Id object associated with this Attribution. If you
     * want to know the value you need to get the value (or name) of
     * the Id. I.e: id.getName()
     * @return Id id
     */
    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    /**
     * Returns the Number object associated with this Attribution. If you
     * want to know the value you need to get the value of the Number.
     * I.e: number.getValue()
     * @return Number number
     */
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

    /**
     * Returns the content of the attribution in a readable way.
     * I.e: ID: a   Value: 5    Type: INT
     * @return "ID: " + id + "\tValue: " + number + "\tType: " + type + "\n"
     */
    @Override
    public String toString() {
        return "ID: " + id + "\tValue: " + number + "\tType: " + type + "\n";
    }
}
