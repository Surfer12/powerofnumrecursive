package powerofnumrecursive;
/* Write a function power(x, n) that calculates x raised to the power of n, where n is a non-negative integer. Your solution must use recursion. Aim for a time complexity of O(log n).
Requirements:

Functionality: The power(x, n) function should accurately calculate the result for any valid input values of x and n (where n >= 0).
Recursion: The solution must utilize a recursive approach.
Time Complexity: Strive to achieve a time complexity of O(log n).
Explanation: Provide a clear explanation of the time complexity of your code. */


public class RecursiveReducedComments {
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
