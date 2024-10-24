package powerofnumrecursive;

public class mainMethod {
    public static void main(String[] args) {
        PowerOfNumRecursiveImproved obj = new PowerOfNumRecursiveImproved();
        System.out.println(obj.power(2, 3));
        RecursiveReduced obj2 = new RecursiveReduced();
        System.out.println(obj2.power(3, 3));
        UnusureOfOptimizedPower obj3 = new UnusureOfOptimizedPower();
        System.out.println(obj3.power(4, 3));
    }
}
