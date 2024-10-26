package powerofnumrecursive;

/**
 * PowerCalculator provides a method to calculate the power of a number using recursion.
 * The implementation ensures a time complexity of O(log n).
 */
public class PowerCalculator {
    /**
     * Calculates x raised to the power of n using recursion.
     *
     * @param x the base number
     * @param n the exponent (non-negative integer)
     * @return the result of x^n
     * @throws IllegalArgumentException if n is negative
     */
    public double power(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Negative exponent not allowed: " + n + ". Please provide a non-negative integer."
            );
        }
        if (n == 0) {
            return 1.0;
        }

        double halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
}
