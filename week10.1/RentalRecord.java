package Week10_1;

/**
 * Represents a rental record for a vehicle.
 */
public class RentalRecord {
    private Vehicle vehicle;
    private String customerName;
    private int rentalDays;

    public RentalRecord(Vehicle vehicle, String customerName, int rentalDays) {
        this.vehicle = vehicle;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalPrice() {
        return vehicle.calculateDailyPrice() * rentalDays;
    }

    public String getRentalDetails() {
        return "Customer: " + customerName +
                "\nWeek10_1.Vehicle: " + vehicle.getDetails() +
                "\nRental Days: " + rentalDays +
                "\nTotal Price: $" + calculateTotalPrice();
    }
}
