package powerofnumrecursive;
// write recursive function to calculate power of a number in o(log(n)) time complexity

public class RecursiveReduced {
    public int power(int num, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 0) {
            int halfPower = power(num, exp / 2);
            return halfPower * halfPower; // Use the property of exponents
        } else {
            return num * power(num, exp - 1); // If exp is odd
        }
    }
}

// the above function is not optimized and takes o(n) time complexity
// we can optimize it to o(log(n)) time complexity by using the following approach
// we can use the property of exponents that (a^b) * (a^b) = a^(2b)
// and (a^b) / (a^b) = a^(b-b) = a^0 = 1
// we can use this property to reduce the time complexity
// we can recursively call the function with exp as exp/2 and multiply the result with itself
// if exp is odd we can multiply the result with num
// this approach will reduce the time complexity to o(log(n))


/* Explanation of Changes
The power method has been modified to check if the exponent (exp) is even or odd.
If exp is even, it calculates the power of num raised to exp/2 and multiplies the result by itself.
If exp is odd, it multiplies num by the result of power(num, exp - 1).
This approach reduces the time complexity to O(log(n)). */