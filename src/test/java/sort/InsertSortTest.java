package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void sort() {
        int[] array = new int[]{1,2,3,5,4,4};
        new InsertSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}