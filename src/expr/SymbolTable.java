package expr;

import java.util.ArrayList;

/**
 * Class used to store all the attributions of the program.
 * It consists of an ArrayList.
 */
public class SymbolTable {

    private ArrayList<Attribution> symbolTable;

    public SymbolTable() {
        symbolTable = new ArrayList<Attribution>();
    }

    public void add(Attribution _attribution) {
        symbolTable.add(_attribution);
    }

    /**
     * This method iterates over the array looking for the element
     * that have the given id. Once this element is found this method
     * returns its value.
     * I.e: Consider: a:INT=1; Given 'a' as the id this method will return 1.
     * @param id id is the name of the variable.
     * @return Returns the value inside the given variable
     * @throws NullPointerException If the given id can't be found this method
     * throws a NullPointerException showing that the given id doesn't exist.
     */
    public int valueof(Id id) {
        for (int i = 0; i < symbolTable.size(); i++) {
            if (symbolTable.get(i).getId().equals(id)) {
                return symbolTable.get(i).getNumber().getValue();
            }
        }
        throw new NullPointerException("Value not found.");
    }

    /**
     * Boolean method to check if a given id exists or not.
     * @param id id is the name of the variable
     * @return Returns true if the id exists or false if it doesn't
     */
    public boolean check(Id id) {
        for (int i = 0; i < symbolTable.size(); i++) {
            if (symbolTable.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println(symbolTable.toString());
    }
}
