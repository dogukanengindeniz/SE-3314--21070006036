package week12;

/**
 * Demonstrates loop control violations and correct implementations.
 */
public class LoopControl {

    /**
     * Correct use: Calculates sum of squares of first 10 positive integers.
     */
    public int sumOfSquares() {
        int sum = 0; // Declaration and usage are close (Checkstyle-compliant)
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Correct use: Prints a right-angled triangle of height 5.
     */
    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Incorrect use: Modifies loop control variable inside the loop (Checkstyle violation intended).
     */
    public void modifyIndexIncorrectly() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            i++; // This line demonstrates incorrect modification
        }
    }
}
