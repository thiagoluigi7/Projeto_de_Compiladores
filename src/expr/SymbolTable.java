package expr;

import java.util.ArrayList;

public class SymbolTable {

    private ArrayList<Symbol> symbolTable;

    public SymbolTable() {
        symbolTable = new ArrayList<Symbol>();
    }

    public void add(Symbol _symbol) {
        symbolTable.add(_symbol);
    }

    public int valueof(String id) {
        for (int i = 0; i < symbolTable.size(); i++) {
            if (symbolTable.get(i).getId().equals(id)) {
                return symbolTable.get(i).getValue();
            }
        }
        throw new NullPointerException("Value not found.");
    }

    public boolean check(String id) {
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
