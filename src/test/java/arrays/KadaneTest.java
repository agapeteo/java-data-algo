package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class KadaneTest {

    @Test
    void testMaxSum_1() {
        assertEquals(7, Kadane.maxSum(Arrays.asList(-1, 2, 3, -7, 3, 4)));
    }

    @Test
    void testMaxSum_2() {
        assertEquals(137, Kadane.maxSum(Arrays.asList(34, -50, 42, 14, -5, 86)));
    }
}