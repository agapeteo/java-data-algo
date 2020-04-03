package sort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListBasedCountingSortTest {

    @Test
    void sort() {
        // given
        int[] arr = new int[]{2, 4, 14, 7, 4};

        // when
        ListBasedCountingSort.sort(arr);

        // then
        assertArrayEquals(new int[]{2, 4, 4, 7, 14}, arr);
    }
}