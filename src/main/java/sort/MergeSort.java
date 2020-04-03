package sort;

import java.util.ArrayList;
import java.util.List;


public class MergeSort {

    /**
     * Using Lists for better support of generics. Same algorithms applies to arrays
     **/
    public static <T extends Comparable<? super T>> void mergeSort(List<T> listToSort) {
        if (listToSort == null || listToSort.size() < 2) return;

        List<T> tmpList = new ArrayList<>(listToSort); // temporarily container to keep data for merge sort

        mergeSort(listToSort, tmpList, 0, listToSort.size() - 1); // high index inclusive
    }

    private static <T extends Comparable<? super T>> void mergeSort(List<T> listToSort, List<T> tmpList, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx) return;

        int middleIdx = lowIdx + (highIdx - lowIdx) / 2;
        mergeSort(listToSort, tmpList, lowIdx, middleIdx); //  sort left side
        mergeSort(listToSort, tmpList, middleIdx + 1, highIdx); // sort right side

        merge(listToSort, tmpList, lowIdx, middleIdx, highIdx); // merge sorted from left and right sides
    }

    private static <T extends Comparable<? super T>> void merge(List<T> listToSort, List<T> tmpList, int lowIdx, int middleIdx, int highIdx) {
        for (int i = lowIdx; i <= highIdx; i++) {
            tmpList.set(i, listToSort.get(i));
        }

        int leftIdx = lowIdx;
        int rightIdx = middleIdx + 1;
        int curIdx = leftIdx;

        while (leftIdx <= middleIdx && rightIdx <= highIdx) {
            if (tmpList.get(leftIdx).compareTo(tmpList.get(rightIdx)) < 0) {
                listToSort.set(curIdx, tmpList.get(leftIdx));
                leftIdx++;
            } else {
                listToSort.set(curIdx, tmpList.get(rightIdx));
                rightIdx++;
            }
            curIdx++;
        }

        int remainingCount = middleIdx - leftIdx;
        for (int i = 0; i <= remainingCount; i++) {
            listToSort.set(curIdx + i, tmpList.get(leftIdx + i));
        }
    }
}
