package week12;

public class PaymentService {

    public boolean processPayment(String cardNumber, double amount, String currency) {
        if (cardNumber == null || cardNumber.length() < 16) {
            System.out.println("Invalid card number.");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Payment amount must be positive.");
            return false;
        }

        if (currency == null || currency.isEmpty()) {
            System.out.println("Currency is missing.");
            return false;
        }

        if (cardNumber.startsWith("4")) {
            if (currency.equalsIgnoreCase("USD")) {
                System.out.println("Processing Visa USD payment...");
            } else {
                System.out.println("Processing Visa payment in other currency...");
            }
        } else {
            System.out.println("Processing non-Visa card...");
        }

        return true;
    }
}
