package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LomutoQuickSortTest {

    @Test
    public void simpleAscending() {
        // given
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        // when
        LomutoQuickSort.sort(array);

        // then
        System.out.println(Arrays.toString(array));
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6}, array));
    }

    @Test
    public void simpleDescending() {
        // given
        int[] array = new int[]{5, 4, 3, 2, 1};

        // when
        LomutoQuickSort.sort(array);

        // then
        System.out.println(Arrays.toString(array));
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5}, array));
    }

    @Test
    public void trickyCase() {
        // given
        int[] array = new int[]{4, 2, 0, 5, 1};

        // when
        LomutoQuickSort.sort(array);

        // then
        System.out.println(Arrays.toString(array));
        assertTrue(Arrays.equals(new int[]{0, 1, 2, 4, 5}, array));
    }

    @Test
    public void simpleExample() {
        // given
        int[] array = new int[]{1, 9, 3, 5, 4, 1};

        // when
        LomutoQuickSort.sort(array);

        // then
        System.out.println(Arrays.toString(array));
        assertTrue(Arrays.equals(new int[]{1, 1, 3, 4, 5, 9}, array));
    }

    @Test
    public void withMirroredDups() {
        // given
        int[] array = new int[]{5, 5, 3, 5, 7, 5, 5};

        // when
        LomutoQuickSort.sort(array);

        // then
        System.out.println(Arrays.toString(array));
        assertTrue(Arrays.equals(new int[]{3, 5, 5, 5, 5, 5, 7}, array));
    }

    @Test
    public void withMirroredDups2() {
        // given
        int[] array = new int[]{5, 5, 7, 8, 5, 3, 5, 1, 2, 3};

        // when
        LomutoQuickSort.sort(array);

        // then
        System.out.println(Arrays.toString(array));
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 3, 5, 5, 5, 5, 7, 8}, array));
    }

}