package composite;

import java.util.ArrayList;
import java.util.List;

public class Table implements PriceComponent {
    private int tableNumber;
    private List<PriceComponent> items;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.items = new ArrayList<>();
    }

    public void addItem(PriceComponent item) {
        items.add(item);
    }

    public void removeItem(PriceComponent item) {
        items.remove(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (PriceComponent item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String getName() {
        return "Table " + tableNumber;
    }

    public List<PriceComponent> getItems() {
        return items;
    }

    public String generateBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Bill for ").append(getName()).append(":\n");
        for (PriceComponent item : items) {
            bill.append("- ").append(item.getName()).append(": $").append(item.getPrice()).append("\n");
        }
        bill.append("Total: $").append(getPrice());
        return bill.toString();
    }
}