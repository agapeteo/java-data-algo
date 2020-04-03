package sort;

import java.util.ArrayList;
import java.util.List;

public class ListBasedCountingSort {

    public static void sort(int[] array) {
        List<Integer>[] countingArr = new List[max(array) + 1];

        for (int i = 0; i < array.length; i++) {
            List<Integer> curList = countingArr[array[i]];
            if (curList == null) {
                curList = new ArrayList<>();
                curList.add(array[i]);
                countingArr[array[i]] = curList;
            } else {
                curList.add(array[i]);
            }
        }

        int idx = 0;
        for (int i = 0; i < countingArr.length; i++) {
            List<Integer> curList = countingArr[i];

            if (curList == null) continue;

            for (int j = 0; j < curList.size(); j++) {
                array[idx] = curList.get(j);
                idx++;
            }
        }
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
