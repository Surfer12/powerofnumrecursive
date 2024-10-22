package powerofnumrecursive;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfNumRecursiveTest {

    @Test
    public void testPower() {
        PowerOfNumRecursive powerCalc = new PowerOfNumRecursive(); // Fixed class name
        assertEquals(1, powerCalc.power(2, 0)); // 2^0 = 1
        assertEquals(2, powerCalc.power(2, 1)); // 2^1 = 2
        assertEquals(4, powerCalc.power(2, 2)); // 2^2 = 4
        assertEquals(8, powerCalc.power(2, 3)); // 2^3 = 8
        assertEquals(16, powerCalc.power(2, 4)); // 2^4 = 16
    }
}
