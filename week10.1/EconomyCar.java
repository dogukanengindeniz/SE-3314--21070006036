package Week10_1;

/**
 * Represents an economy car which may have hybrid support.
 */
public class EconomyCar extends Vehicle {
    private static final double BASE_PRICE = 50.0;
    private static final double HYBRID_PRICE = 10.0;

    private boolean isHybrid;

    public EconomyCar(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }

    @Override
    public double calculateDailyPrice() {
        return isHybrid ? BASE_PRICE + HYBRID_PRICE : BASE_PRICE;
    }
}
