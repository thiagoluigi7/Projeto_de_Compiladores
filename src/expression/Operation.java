package expression;

import java.util.ArrayList;

public class Operation extends Expression {
    ArrayList<Expression> operands;
    ArrayList<String> operators;

    public Operation(ArrayList<Expression> _operands, ArrayList<String> _operators) {
        this.operands = _operands;
        this.operators = _operators;
    }

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
