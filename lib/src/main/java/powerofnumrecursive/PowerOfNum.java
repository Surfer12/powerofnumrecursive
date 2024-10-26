package powerofnumrecursive;
  /**
   * Calculates x raised to the power of n using recursion.
   *
   * @param x the base number
   * @param n the exponent (non-negative integer)
   * @return the result of x^n
   * @throws IllegalArgumentException if n is negative
   */

public class PowerOfNum {
    public int power(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Negative exponent not allowed: " + n + ". Please provide a non-negative integer."
            );
        }
        if (n == 0) {
            return 1;
        }

        int halfPower = power(x, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
}