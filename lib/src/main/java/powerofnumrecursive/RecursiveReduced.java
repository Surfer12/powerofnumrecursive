// write recursive function to calculate power of a number in o(log(n)) time complexity

public class RecursiveReduced {
    private int num;
    private int exp;
    public int power(int num, int exp)
    {
        if(exp == 0)
        {
            return 1;
        }
        return num * power(num, exp - 1);
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