package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void sort() {
        // given
        int[] arr = new int[]{2, 4, 14, 7, 4};

        // when
        int[] actual = CountingSort.sort(arr);

        // then
        assertArrayEquals(new int[]{2, 4, 4, 7, 14}, actual);
    }
}