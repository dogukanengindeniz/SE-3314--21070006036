package week12;

import java.util.List;

public class OrderProcessor {

    public boolean processOrder(String orderId, List<String> items) {
        if (orderId == null || orderId.trim().isEmpty()) {
            System.out.println("Invalid order ID.");
            return false;
        }

        if (items == null || items.isEmpty()) {
            System.out.println("Order must contain at least one item.");
            return false;
        }

        System.out.println("Processing order: " + orderId);

        for (String item : items) {
            if (item != null && item.toLowerCase().contains("item")) {
                System.out.println("Valid item: " + item);
            } else {
                System.out.println("Skipping unknown or invalid item.");
            }
        }

        return true;
    }
}
