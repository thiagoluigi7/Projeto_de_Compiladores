package expr;

/**
 * Class used to store an operation. An operation is composed
 * by two attribution and one operator. It also includes an id
 * to find it on the OpTable.
 */
public class Operation extends Expression {
    private Attribution operand1;
    private Attribution operand2;
    private char operator;
    // Todo Think how the id of the operations will work.
    private Id id;

    /**
     * Constructor of the Operation class.
     * @param _operand1 _operand1 is an Attribution object
     * @param _operand2 _operand2 is an Attribution object
     * @param _operator _operator is a char object. It can be '+' or '*'
     * @param _id _id is an Id object
     */
    public Operation(Attribution _operand1, Attribution _operand2, char _operator, Id _id) {
        this.operand1 = _operand1;
        this.operand2 = _operand2;
        this.operator = _operator;
        this.id = _id;
    }

    public Attribution getOperand1() {
        return operand1;
    }

    public void setOperand1(Attribution operand1) {
        this.operand1 = operand1;
    }

    public Attribution getOperand2() {
        return operand2;
    }

    public void setOperand2(Attribution operand2) {
        this.operand2 = operand2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    /**
     * Returns the Id object associated with this Operation. If you
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
     * Return the operation in a readable way.
     * I.e: a + b
     * @return operand1 + " " + operator + " " + operand2
     */
    @Override
    public String toString() {
        return operand1 + " " + operator + " " + operand2;
    }

}
