package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void gcd() {
        assertEquals(4, GreatestCommonDivisor.gcd(8, 12));
    }
}