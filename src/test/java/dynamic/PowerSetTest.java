package dynamic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetTest {

    @Test
    void powerSet() {
        System.out.println(PowerSet.powerSet(Arrays.asList(1, 2, 3)));
    }
}