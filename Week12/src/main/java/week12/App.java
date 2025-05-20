package week12;

/**
 * Main app to run loop demonstrations.
 */
public class App {
    public static void main(String[] args) {
        LoopControl lc = new LoopControl();
        ExampleUsage eu = new ExampleUsage();

        System.out.println("Sum of Squares: " + lc.sumOfSquares());
        lc.printTriangle();
        lc.modifyIndexIncorrectly();

        System.out.println("Even numbers count: " + eu.filterAndCountEvenNumbers());
        System.out.println("Matrix Diagonal Sum: " + eu.matrixDiagonalSum());
    }
}
