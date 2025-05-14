package Week10_1;

/**
 * Represents a luxury car with optional GPS and leather seats.
 */
public class LuxuryCar extends Vehicle {
    private static final double BASE_PRICE = 100.0;
    private static final double GPS_PRICE = 20.0;
    private static final double LEATHER_SEAT_PRICE = 30.0;

    private boolean hasGps;
    private boolean hasLeatherSeats;

    public LuxuryCar(String brand, String model, String licensePlate, boolean hasGps, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGps = hasGps;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    @Override
    public double calculateDailyPrice() {
        double price = BASE_PRICE;
        if (hasGps) price += GPS_PRICE;
        if (hasLeatherSeats) price += LEATHER_SEAT_PRICE;
        return price;
    }
}
