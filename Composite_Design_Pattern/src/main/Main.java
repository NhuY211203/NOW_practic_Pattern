package main;

import composite.CoffeeShop;
import composite.Product;
import composite.Table;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop("My Coffee Shop");

        Product coffee = new Product("Coffee", 2.5);
        Product water = new Product("Water", 1.0);
        Product milkTea = new Product("Milk Tea", 3.0);

        Table table1 = new Table(1);
        table1.addItem(coffee);
        table1.addItem(water);

        Table table2 = new Table(2);
        table2.addItem(milkTea);
        table2.addItem(coffee);

        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        System.out.println(table1.generateBill());
        System.out.println(table2.generateBill());

        double totalRevenue = 0;
        for (Table table : coffeeShop.getTables()) {
            totalRevenue += table.getPrice();
        }
        System.out.println("Total " + coffeeShop.getName() + ": $" + totalRevenue);
    }
}