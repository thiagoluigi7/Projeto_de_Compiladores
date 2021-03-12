package expr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class containing an ArrayList with all the operations of the program.
 */
public class OpTable {

    private ArrayList<Operation> opTable;

    public OpTable() {
        this.opTable = new ArrayList<>();
    }

    public void add(Operation _operation) {
        opTable.add(_operation);
    }

    //Todo Improve this comment in the 24 line.
    /**
     * This method iterates over the array looking for the operation
     * that have the given id. Once this operation is found this method
     * returns the operation in a readable way.
     * I.e: Consider: a:INT=1; Given 'a' as the id this method will return 1.
     * @param id id is the name of the operation.
     * @return Returns operation in a readable way
     * @throws NullPointerException If the given id can't be found this method
     * throws a NullPointerException showing that the given operation doesn't exist.
     */
    public int valueof(Id id) {
        for (int i = 0; i < opTable.size(); i++) {
            if (opTable.get(i).getId().equals(id)) {
                System.out.println(opTable.get(i));
            }
        }
        throw new NullPointerException("Operation not found.");
    }

    /**
     * Boolean method to check if the operation that contains the given id exists or not.
     * @param id id is the id of the operation
     * @return Returns true if the operation exists or false if it doesn't
     */
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
