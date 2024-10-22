// power of a number using recursion
public class PowerOfNumRecursive {
 
    private int num;
    private int exp;
    public int power(int num, int exp)
    {  
        if(exp == 0)
        {
            return 1;
        }
        return num *= power(num, exp - 1);
    }
}
