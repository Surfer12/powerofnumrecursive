package powerofnumrecursive;
// power of a number using recursion improved
public class PowerOfNumRecursiveImproved {
    public double power(double num, double exp)
    {  
        if(exp == 0)
        {
            return 1.0;
        }
        // if exp is odd then we can use the property of exponents that (a^b) * (a^b) = a^(2b)
        if(exp % 2 == 0){
            double halfPower = power(num, exp / 2);
            return Math.pow(halfPower, 2);
        }
        else {
            return num * power(num, exp - 1); // if exp is odd then we can use the standard formula of power of a number and multiply it with num
        }
    }
}

// the above function is not optimized and takes o(n) time complexity
// the space complexity is o(n) because the recursive call stack is used to store the intermediate results
// the time complexity is o(n) because we are calling the function recursively and decrementing the exponent by 1 in each call
// The o(n) time complexity is due to the fact that the function is called recursively and the exponent is decremented by 1 in each call so the function is called n times
// the space complexity is o(n) because the recursive call stack is used to store the intermediate results
