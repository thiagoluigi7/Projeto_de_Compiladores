package expression;

import java.util.ArrayList;

/**
 * The Operation class is responsible to hold all operations of the application.
 * The operations consists in two arrays. One contains the operands and the other
 * contains the operators.
 */
public class Operation extends Expression {
    ArrayList<Expression> operands;
    ArrayList<String> operators;

    /**
     * The Operation constructor receiveis two arrays. One of operands and other
     * of operators.
     * @param _operands ArrayList containing the expressions that represents the operands
     * @param _operators ArrayList containing the expressions that represents the operators
     */
    public Operation(ArrayList<Expression> _operands, ArrayList<String> _operators) {
        this.operands = _operands;
        this.operators = _operators;
    }

    /**
     * This method intercalates the operands and the operators to show the
     * operation in a readable way.
     * @return return the operation in a readable way
     */
    @Override
    public String toString() {
        String txt = "";
        int j = 0;
        for (int i = 0; i < operands.size(); i++) {
            j = i;
            txt = txt + operands.get(i) + " ";
            if (j < operators.size()) {
                txt = txt + operators.get(j) + " ";
            }
        }
        return txt;
    }

}
