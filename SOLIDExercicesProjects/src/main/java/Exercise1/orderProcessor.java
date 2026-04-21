package Exercise1;

import java.util.List;

public class orderProcessor {
    private List<String> items;
    private double totalAmount;

    public orderProcessor(List<String> items, double totalAmount) {
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public void process() {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }
        if (totalAmount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        System.out.println("Processing order with " + items.size() + " items...");
        System.out.println("Connecting to MySQL Database...");
        System.out.println("INSERT INTO orders (amount) VALUES (" + totalAmount + ")");

        System.out.println("Sending Email: Your order of $" + totalAmount + " is confirmed.");
    }
}
