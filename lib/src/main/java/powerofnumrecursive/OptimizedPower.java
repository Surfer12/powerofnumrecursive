public class OptimizedPower {
    public int power(int num, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 0) { // if exp is even then we can use the property of exponents that (a^b) * (a^b) = a^(2b)
            int halfPower = power(num, exp / 2); // calculate the power of num raised to exp/2 
            return halfPower * halfPower; // return the result of the power of num raised to exp/2 multiplied by itself
        } else {
            return num * power(num, exp - 1); // if exp is odd then we can use the standard formula of power of a number and multiply it with num
        }
    }
}
