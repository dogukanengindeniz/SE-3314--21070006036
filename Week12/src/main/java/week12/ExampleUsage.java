package week12;

/**
 * Demonstrates data manipulation using loops.
 */
public class ExampleUsage {

    /**
     * Filters and counts even numbers from 1 to 20.
     */
    public int filterAndCountEvenNumbers() {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }

        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Calculates the sum of the diagonal elements of a 3x3 matrix.
     */
    public int matrixDiagonalSum() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
