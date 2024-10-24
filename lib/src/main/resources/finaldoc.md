[]: # Title: Power Calculation Classes
[]: # Description: Explanation of Power Calculation Classes

# Explanation of Power Calculation Classes

## 1. PowerOfNumRecursiveImproved
**Overview:** This class implements a recursive method to calculate the power of a number. It checks if the exponent is zero, in which case it returns 1. If the exponent is even, it calculates the power of half the exponent and squares the result. If the exponent is odd, it multiplies the base number by the result of the power function with the exponent decremented by one.

```java:lib/src/main/java/powerofnumrecursive/PowerOfNumRecursiveImproved.java
package powerofnumrecursive;

public class PowerOfNumRecursiveImproved {
    public double power(double num, double exp) {  
        if(exp == 0) {
            return 1.0;
        }
        if(exp % 2 == 0) {
            double halfPower = power(num, exp / 2);
            return Math.pow(halfPower, 2);
        } else {
            return num * power(num, exp - 1);
        }
    }
}
```

## 2. RecursiveReduced
**Overview:** This class also implements a recursive method to calculate the power of a number, similar to the previous class. It optimizes the calculation by reducing the time complexity to O(log(n)) using the properties of exponents. The method checks if the exponent is zero, even, or odd, and calculates the power accordingly.

```java:lib/src/main/java/powerofnumrecursive/RecursiveReduced.java
package powerofnumrecursive;

import java.lang.Math; // clarify the import

public class RecursiveReduced {
    public double power(double num, double exp) {
        if (exp == 0) {
            return 1.0;
        }
        if (exp % 2 == 0) {
            double halfPower = power(num, exp / 2);
            return Math.pow(halfPower, 2);
        } else {
            return num * power(num, exp - 1);
        }
    }
}
```

## 3. UnusureOfOptimizedPower
**Overview:** This class is similar to the RecursiveReduced class and implements the same logic for calculating the power of a number. It also achieves O(log(n)) time complexity by utilizing the properties of exponents. The method structure is identical, focusing on handling the exponent based on its value.

```java:lib/src/main/java/powerofnumrecursive/UnusureOfOptimizedPower.java
package powerofnumrecursive;

public class UnusureOfOptimizedPower {
    public double power(double num, double exp) {
        if (exp == 0) {
            return 1.0;
        }
        if (exp % 2 == 0) {
            double halfPower = power(num, exp / 2);
            return Math.pow(halfPower, 2);
        } else {
            return num * power(num, exp - 1);
        }
    }
}
```

## 4. mainMethod
**Overview:** This class contains the main method, which serves as the entry point for the program. It creates instances of the three power calculation classes and demonstrates their functionality by printing the results of raising numbers to specified powers.

```java:lib/src/main/java/powerofnumrecursive/mainMethod.java
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
```

## Conclusion
The provided classes implement recursive methods to calculate the power of a number efficiently. The `PowerOfNumRecursiveImproved` and `RecursiveReduced` classes optimize the calculation to O(log(n)) time complexity, while the `UnusureOfOptimizedPower` class follows the same logic. The `mainMethod` class serves to test and demonstrate the functionality of these implementations.