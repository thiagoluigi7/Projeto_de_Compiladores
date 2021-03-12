package expr;

import java.util.ArrayList;

public class SymbolTable {

    private ArrayList<Attribution> symbolTable;

    public SymbolTable() {
        symbolTable = new ArrayList<Attribution>();
    }

    public void add(Attribution _attribution) {
        symbolTable.add(_attribution);
    }

    public int valueof(Id id) {
        for (int i = 0; i < symbolTable.size(); i++) {
            if (symbolTable.get(i).getId().equals(id)) {
                return symbolTable.get(i).getNumber().getValue();
            }
        }
        throw new NullPointerException("Value not found.");
    }

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
