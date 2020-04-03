package sort;

public class LomutoQuickSort {

    public static void sort(int[] array) {
        if (array == null || array.length < 2) return;

        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int lowIdx, int highIdx) {
        if (lowIdx >= highIdx) return;

        int partitionIdx = partition(array, lowIdx, highIdx);
        sort(array, lowIdx, partitionIdx - 1);
        sort(array, partitionIdx + 1, highIdx);
    }

    private static int partition(int[] array, int lowIdx, int highIdx) {
        int pivotValue = array[highIdx];
        int i = lowIdx;
        int j = i;

        while (j < highIdx) {
            if (array[j] <= pivotValue) {
                swap(array, i, j);
                i++;
            }
            j++;
        }
        swap(array, highIdx, i);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
