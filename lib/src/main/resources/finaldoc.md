# Explanation of Power Calculation Classes

## 1. PowerCalculator
**Overview:** This class implements a recursive method to calculate the power of a number. It checks if the exponent is zero, in which case it returns 1. If the exponent is even, it calculates the power of half the exponent and squares the result. If the exponent is odd, it multiplies the base number by the result of the power function with the exponent decremented by one.
java:lib/src/main/java/powerofnumrecursive/PowerCalculator.java
package powerofnumrecursive;

/**
 * PowerCalculator provides a method to calculate the power of a number using recursion.
 * The implementation ensures a time complexity of O(log n).
 */
public class PowerCalculator {
    /**
     * Calculates x raised to the power of n using recursion.
     *
     * @param x the base number
     * @param n the exponent (non-negative integer)
     * @return the result of x^n
     * @throws IllegalArgumentException if n is negative
     */
    public double power(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Negative exponent not allowed: " + n + ". Please provide a non-negative integer."
            );
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

java:lib/src/main/java/powerofnumrecursive/MainMethod.java
package powerofnumrecursive;

/**
 * MainMethod serves as the entry point for the Power Calculator program.
 */
public class MainMethod {
    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        System.out.println("2^3 = " + calculator.power(2, 3));
        System.out.println("3^3 = " + calculator.power(3, 3));
        System.out.println("4^3 = " + calculator.power(4, 3));
    }
}

## Conclusion

The project has been streamlined by consolidating redundant classes into a single `PowerCalculator` class, ensuring consistent parameter types, improving error handling through exceptions, and correcting class naming. Additionally, the `MainMethod` class has been refactored to utilize the updated power calculator, and the documentation has been revised to reflect these changes. These updates enhance the maintainability, readability, and reliability of the codebase.

---

## Additional Recommendations

1. **Unit Testing**: Implement comprehensive unit tests for the `PowerCalculator` class to validate its functionality across various scenarios, including edge cases. Utilize JUnit for writing these tests.
2. **Code Formatting**: Adopt a consistent code formatting style across the project. Tools like [Google Java Format](https://github.com/google/google-java-format) can automate this process.
3. **Continuous Integration**: Set up a CI pipeline (e.g., using GitHub Actions) to automatically build and test the project on commits and pull requests.
4. **Dependency Management**: Review the `build.gradle` and `libs.versions.toml` files to ensure all dependencies are up-to-date and necessary.
5. **Enhanced Documentation**: Expand the documentation to include usage examples, contributing guidelines, and detailed explanations of the code architecture to aid future developers.
6. **Exception Handling in `MainMethod`**: Modify the `MainMethod` to handle potential exceptions thrown by the `PowerCalculator` class gracefully, ensuring the program does not terminate unexpectedly.

By implementing these recommendations, the project will not only be more robust and maintainable but also adhere to best practices in software development.