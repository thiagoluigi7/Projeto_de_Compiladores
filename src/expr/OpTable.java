package expr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OpTable {

    private ArrayList<Operation> opTable;

    public OpTable() {
        this.opTable = new ArrayList<>();
    }

    public void add(Operation _operation) {
        opTable.add(_operation);
    }

    public int valueof(String id) {
        for (int i = 0; i < opTable.size(); i++) {
            if (opTable.get(i).getId().getName().equals(id)) {
                System.out.println(opTable.get(i));
            }
        }
        throw new NullPointerException("Operation not found.");
    }

    public boolean check(String id) {
        for (int i = 0; i < opTable.size(); i++) {
            if (opTable.get(i).getId().getName().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void print(){
        System.out.println(opTable.toString());
    }
}
