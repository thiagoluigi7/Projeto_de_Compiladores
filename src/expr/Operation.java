package expr;

import java.util.ArrayList;

/**
 * Class used to store an operation. An operation is composed
 * by two attribution and one operator. It also includes an id
 * to find it on the OpTable.
 */
public class Operation extends Expression {
    private ArrayList<Attribution> operands;
    private ArrayList<String> operators;
    private final Id id;


    /**
     * Constructor of the Operation class.
     * @param _opTableSize It's used to create the id of the operation
     */
    public Operation(Integer _opTableSize) {
        this.id = new Id(_opTableSize.toString());
    }

    public Attribution getOperand(Id id) {
        for (Attribution operand : operands) {
            if (operand.getId().equals(id)) {
                return operand;
            }
        }
        throw new NullPointerException("Operand not found.");
    }

    public void setOperand(Attribution operand) {
        operands.add(operand);
    }

    public String getOperator(Id id) {
        return operators.get(Integer.parseInt(id.getName()));
    }

    public void setOperator(String operator) {
        operators.add(operator);
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

    /**
     * Return the operation in a readable way.
     * I.e: a + b
     * @return operand1 + " " + operator + " " + operand2
     */
    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder();
        for (int i = 0; i < operands.size(); i++) {
            txt.append(operands.get(i).getNumber().getValue());
            txt.append(" ");
            if (i < operators.size()) {
                txt.append(operators.get(i));
                txt.append(" ");
            }
        }
        return txt.toString();
    }

}
