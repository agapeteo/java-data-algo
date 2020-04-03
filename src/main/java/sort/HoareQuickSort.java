package sort;

public class HoareQuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx) return;

        int partitionIdx = partition(array, lowIdx, highIdx);
        sort(array, lowIdx, partitionIdx - 1);
        sort(array, partitionIdx + 1, highIdx);
    }

    private static int partition(int[] array, int lowIdx, int highIdx) {
        int pivotValue = array[lowIdx];
        int leftIdx = lowIdx;
        int rightIdx = highIdx + 1;

        while (true) {
            do {
                leftIdx++;
                if (leftIdx == highIdx) break;
            } while (array[leftIdx] < pivotValue);

            do {
                rightIdx--;
                if (rightIdx == lowIdx) break;
            } while (array[rightIdx] > pivotValue);

            if (leftIdx >= rightIdx) break;

            swap(array, leftIdx, rightIdx);
        }
        swap(array, lowIdx, rightIdx); // put pivot value to final pivot index
        return rightIdx;
    }

    private static void swap(int[] array, int leftIdx, int rightIdx) {
        int tmpValue = array[leftIdx];
        array[leftIdx] = array[rightIdx];
        array[rightIdx] = tmpValue;
    }
}
