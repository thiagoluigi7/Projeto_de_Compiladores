package expression;

import java.util.ArrayList;
import java.util.List;

public class Program extends Expression {
    List<Expression> expressionList;

    public Program(){
        this.expressionList = new ArrayList<>();
    }

    public void addExpression(Expression e){
        this.expressionList.add(e);
    }


}
