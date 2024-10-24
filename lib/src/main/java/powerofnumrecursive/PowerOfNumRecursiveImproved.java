package powerofnumrecursive;

public class PowerOfNumRecursiveImproved {
    public double power(double num, double exp) {  
        if(exp == 0) {
            return 1.0;
        }
        if(exp % 2 == 0) {
            double halfPower = power(num, exp / 2);
            return Math.pow(halfPower, 2);
        } else {
            return num * power(num, exp - 1);
        }
    }
}
