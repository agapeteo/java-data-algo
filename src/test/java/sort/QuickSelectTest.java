package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSelectTest {

    @Test
    void top_0() {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 9);

        int actual = QuickSelect.top(0, list);

        assertEquals(1, actual);
    }

    @Test
    void top_1() {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 9);

        int actual = QuickSelect.top(1, list);

        assertEquals(2, actual);
    }

    @Test
    void top_2() {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 9);

        int actual = QuickSelect.top(2, list);

        assertEquals(4, actual);
    }

    @Test
    void top_3() {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 9);

        int actual = QuickSelect.top(3, list);

        assertEquals(7, actual);
    }

    @Test
    void top_4() {
        List<Integer> list = Arrays.asList(2, 1, 4, 7, 9);

        int actual = QuickSelect.top(4, list);

        assertEquals(9, actual);
    }
}