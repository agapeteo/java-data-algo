package bits;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetTest {

    @Test
    void powerSet() {
        List<List<Integer>> actual = PowerSet.powerSet(Arrays.asList(1, 2, 3));
        System.out.println(actual);
    }
}