package powerofnumrecursive;
a        
public class PowerOfNumRecursiveImproved {
    public double power(double x, double n) {
        if (n == 0) {
            return 1.0;
        }
        if (n % 2 == 0) {
            double halfPower = power(x, n / 2);
            return Math.pow(halfPower, 2);
        } else {
            return x * power(x, n - 1);
        }
    }
}
