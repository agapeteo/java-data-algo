package other;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SearchInSortedArrayTest {

    @Test
    void findInArray() {
        int[] array = new int[]{1,2,3,4,5,6};
//        int[] array = new int[]{2, 4, 6, 8, 10};
        System.out.println(SearchInSortedArray.findInArray(array, 1));
        System.out.println(SearchInSortedArray.findInArray(array, 2));
        System.out.println(SearchInSortedArray.findInArray(array, 3));
        System.out.println(SearchInSortedArray.findInArray(array, 4));
        System.out.println(SearchInSortedArray.findInArray(array, 5));
        System.out.println(SearchInSortedArray.findInArray(array, 6));
        System.out.println(SearchInSortedArray.findInArray(array, 7));
//        System.out.println(SearchInSortedArray.findInArray(array, 8));
//        System.out.println(SearchInSortedArray.findInArray(array, 9));
//        System.out.println(SearchInSortedArray.findInArray(array, 10));
//        System.out.println(SearchInSortedArray.findInArray(array, 11));
    }
}