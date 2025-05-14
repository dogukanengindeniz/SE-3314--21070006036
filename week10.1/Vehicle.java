package Week10_1;

/**
 * Abstract class representing a generic vehicle.
 */
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String licensePlate;

    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public abstract double calculateDailyPrice();

    public String getDetails() {
        return brand + " " + model + " (" + licensePlate + ")";
    }
}
