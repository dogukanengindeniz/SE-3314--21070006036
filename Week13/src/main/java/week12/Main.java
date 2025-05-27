package week12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        boolean orderResult = processor.processOrder("ORD123", Arrays.asList("item1", "item2", null));
        System.out.println("Order processing success: " + orderResult);

        UserValidator validator = new UserValidator();
        boolean userValid = validator.validateUser("Alice", 25, "alice@example.com");
        System.out.println("User validation success: " + userValid);

        PaymentService paymentService = new PaymentService();
        boolean paymentResult = paymentService.processPayment("4123456789012345", 150.00, "USD");
        System.out.println("Payment processing success: " + paymentResult);
    }
}
