package Week10_1;

/**
 * Entry point for testing the Car Rental System.
 */
public class Main {
    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar("BMW", "X5", "34ABC123", true, true);
        EconomyCar economyCar = new EconomyCar("Toyota", "Corolla", "06XYZ789", true);

        RentalRecord record1 = new RentalRecord(luxuryCar, "Alice", 3);
        RentalRecord record2 = new RentalRecord(economyCar, "Bob", 5);

        System.out.println(record1.getRentalDetails());
        System.out.println("-----");
        System.out.println(record2.getRentalDetails());
    }
}
