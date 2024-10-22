// power of a number using recursion

public class powerofnumrecursive {
    private int result;
    private int base;
    private int exp;
    public int power(int num, int exp)
    { int result = 1; 
        if(exp == 0)
        {
            return result;
        }
        return result *= power(num, exp--);
    }
}
