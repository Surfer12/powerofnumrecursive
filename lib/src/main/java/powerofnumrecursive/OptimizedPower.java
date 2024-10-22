// write recursive function to calculate power of a number in o(log(n)) time complexity
// provide analysis of time and space complexity

public class OptimizedPower {
    public int power(int num, int exp) { 
        int halfPower;
        if (exp == 0) {
            return 1; // base case
        }
        if (exp % 2 == 0) { // if exp is even then we can use the property of exponents that (a^b) * (a^b) = a^(2b) 
            halfPower = power(num, exp / 2); // calculate the power of num raised to exp/2 i.e if exp is 4 then we calculate the power of num raised to 2 
            return halfPower * halfPower; // return the result i.e if exp is 4 then we return the power of num raised to 2 multiplied by itself
        } else {
            return num * power(num, exp - 1); // if exp is odd then we can use the standard formula of power of a number and multiply it with num
        }
    }
}

// the above function is optimized and takes o(log(n)) time complexity
// the space complexity is o(log(n)) due to the recursive call stack
// the time complexity is o(log(n)) because we are reducing the exponent by half when it is even in each recursive call
// The exponent is reduced after each recursive call when it is odd as it is decremented by 1
// and the space complexity is o(log(n)) because the recursive call stack is used to store the intermediate results
// the above function is more efficient and faster than the non optimized function 
// the utilization of the property of exponents that (a^b) * (a^b) = a^(2b) is used to reduce the time complexity.
// This property is known as "exponentiation by squaring" and it is a well-known technique for computing powers efficiently.
// the optimized function takes less time and space to compute the power of a number without using any extra space or variables

/* 
2. **Flow:**
   - User calls `power(num, exp)`
   - If `exp == 0`:
     - Return `1`
   - Else if `exp % 2 == 0`:
     - Call `power(num, exp / 2)`
     - Store result in `halfPower`
     - Return `halfPower * halfPower`
   - Else:
     - Call `power(num, exp - 1)`
     - Return `num * result`

### Example of Sequence Diagram Steps

- **User** -> **OptimizedPower**: `power(num, exp)`
- **OptimizedPower**: Check if `exp == 0`
  - If true: Return `1`
- **OptimizedPower**: Check if `exp % 2 == 0`
  - If true: 
    - Call `power(num, exp / 2)`
    - Store result in `halfPower`
    - Return `halfPower * halfPower`
- **OptimizedPower**: Else:
  - Call `power(num, exp - 1)`
  - Return `num * result`

 */