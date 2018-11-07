package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sortRecursive() {
        int[] array = new int[]{1, 12, 3, 5, 2, 12, 2};
        new SelectionSort().sortRecursive(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    void sort() {
        int[] array = new int[]{1, 12, 3, 5, 2, 12, 2};
        new SelectionSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}