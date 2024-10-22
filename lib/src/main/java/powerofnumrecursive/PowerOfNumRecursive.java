// power of a number using recursion
public class PowerOfNumRecursive {
    public int power(int num, int exp)
    {  
        if(exp == 0)
        {
            return 1;
        }
        return num *= power(num, exp - 1);
    }
}

// the above function is not optimized and takes o(n) time complexity
// the space complexity is o(n) because the recursive call stack is used to store the intermediate results
// the time complexity is o(n) because we are calling the function recursively and decrementing the exponent by 1 in each call
// The o(n) time complexity is due to the fact that the function is called recursively and the exponent is decremented by 1 in each call so the function is called n times
// the space complexity is o(n) because the recursive call stack is used to store the intermediate results
