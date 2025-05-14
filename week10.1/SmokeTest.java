package Week10_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Basic smoke test for project setup.
 */
public class SmokeTest {
    @Test
    public void testRentalRecordCalculation() {
        LuxuryCar car = new LuxuryCar("Audi", "A8", "01AAA111", true, false);
        RentalRecord record = new RentalRecord(car, "Tester", 2);
        assertTrue(record.calculateTotalPrice() > 0);
    }
}
