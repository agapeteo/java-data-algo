package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    public void simpleTest() {
        int[] arr1 = new int[]{4, 3, 9, 7, 5, 3, 1};
        int[] arr2 = new int[]{10, 9, 8, 0, 100, 0, 8, 9, 10};
        int[] arr3 = new int[]{4, 3, 9, 7, 5, 3, 1};
        int[] arr4 = new int[]{0, 0};
        int[] arr5 = new int[]{1, 0, 0};
        int[] arr6 = new int[]{1, 2, 3};
        int[] arr7 = new int[]{3, 2, 1};
//        System.out.println(Arrays.toString(arr));

        QuickSort.quickSort(arr1);
        QuickSort.quickSort(arr2);
        QuickSort.quickSort(arr3);
        QuickSort.quickSort(arr4);
        QuickSort.quickSort(arr5);
        QuickSort.quickSort(arr6);
        QuickSort.quickSort(arr7);


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr7));

    }

}