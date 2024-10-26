package powerofnumrecursive;

/* Write a function power(x, n) that calculates x raised to the power of n, where n is a non-negative integer. Your solution must use recursion. Aim for a time complexity of O(log n).
Requirements:

Functionality: The power(x, n) function should accurately calculate the result for any valid input values of x and n (where n >= 0).
Recursion: The solution must utilize a recursive approach.
Time Complexity: Strive to achieve a time complexity of O(log n).
Explanation: Provide a clear explanation of the time complexity of your code. */


public class PowerOfNum {
    public double power(int x, int n) {
        if (n < 0) {
            System.err.println("Negative exponent not allowed: " + n + ". Input a valid number that is greater than or equal to 0");
            return -1;
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

/* Flow:
   - User calls `power(num, exp)`
   - If `exp < 0`:
     - Print error message
     - Return -1
   - If `exp == 0`:
     - Return `1.0`
   - Calculate halfPower = power(num, exp/2)
   - If `exp % 2 == 0`:
     - Return `halfPower * halfPower`
   - Else:
     - Return `num * halfPower * halfPower`

Time Complexity: O(log n)
The algorithm always divides the problem in half at each recursive step,
resulting in a logarithmic number of operations.

Space Complexity: O(log n)
The recursion depth is proportional to log n as we divide by 2 each time.
*/

/* Explanation of Changes
The power method has been modified to check if the exponent (exp) is even or odd.
If exp is even, it calculates the power of num raised to exp/2 and multiplies the result by itself.
If exp is odd, it multiplies num by the result of power(num, exp - 1).
This approach reduces the time complexity to O(log(n)). */

/* Let me explain why the current approach actually works correctly, even for odd exponents:
When n is odd, let's break down what happens:
1. We calculate n/2 using integer division
For any odd number n, n/2 gives us the floor of the division
We multiply by x one extra time to account for the remainder
For example, let's calculate power(2, 5):
The key insight is:
For odd n, x^n = x (x^(n/2))^2
For even n, x^n = (x^(n/2))^2
We don't need to track the remainder separately because multiplying by x one extra time in the odd case handles it mathematically. This maintains the O(log n) complexity while correctly calculating powers for both odd and even exponents. */
