package composite;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private String name;
    private List<Table> tables;

    public CoffeeShop(String name) {
        this.name = name;
        this.tables = new ArrayList<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void removeTable(Table table) {
        tables.remove(table);
    }

    public List<Table> getTables() {
        return tables;
    }

    public Table getTableByNumber(int number) {
        for (Table table : tables) {
            if (table.getName().equals("Table " + number)) {
                return table;
            }
        }
        return null;
    }

    // Added getName() method to fix the error
    public String getName() {
        return name;
    }
}