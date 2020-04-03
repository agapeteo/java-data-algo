package sort;

public class QuickSort {

    public static void quickSort(int[] array) {
        if (array.length < 2) return;

        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx) return;

        int pivotIdx = partition(array, lowIdx, highIdx);
        quickSort(array, lowIdx, pivotIdx - 1);
        quickSort(array, pivotIdx + 1, highIdx);
    }

    private static int partition(int[] array, int lowIdx, int highIdx) {
        int midIdx = lowIdx + (highIdx - lowIdx) / 2;
        int pivotValue = array[midIdx];

        int leftIdx = lowIdx;
        int rightIdx = highIdx;

        while (leftIdx < rightIdx) {
            while (array[leftIdx] < pivotValue) {
                leftIdx++;
            }
            while (array[rightIdx] > pivotValue) {
                rightIdx--;
            }
            if (leftIdx <= rightIdx) {
                int tmpValue = array[leftIdx];
                array[leftIdx] = array[rightIdx];
                array[rightIdx] = tmpValue;
                leftIdx++;
                rightIdx--;
            }
        }
        return leftIdx;
    }
}
