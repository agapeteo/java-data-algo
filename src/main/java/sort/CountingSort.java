package sort;

public class CountingSort {

    public static int[] sort(int[] array) {
        int[] countingArr = new int[max(array) + 1];

        for (int i = 0; i < array.length; i++) {
            int idxByValue = array[i];
            countingArr[idxByValue]++;
        }
        int sum = 0;
        for (int i = 0; i < countingArr.length; i++) {
            sum += countingArr[i];
            countingArr[i] = sum;
        }

        int[] resultArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int curValue = array[i];
            int targetIdx = countingArr[curValue] - 1;
            resultArr[targetIdx] = curValue;
            countingArr[curValue]--;
        }
        return resultArr;
    }

    private static int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
