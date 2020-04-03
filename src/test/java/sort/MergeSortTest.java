package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    public void sortInts() {
        // given
        List<Integer> list = Arrays.asList(2, 1, 3, 5, 7, 6, 7);

        // when
        MergeSort.mergeSort(list);

        // then
        assertEquals(Arrays.asList(1, 2, 3, 5, 6, 7, 7), list);
    }

    @Test
    public void sortStrings() {
        // given
        List<String> list = Arrays.asList("b", "a", "b", "a", "c", "d", ".");

        // when
        MergeSort.mergeSort(list);

        // then
        assertEquals(Arrays.asList(".", "a", "a", "b", "b", "c", "d"), list);
    }

}