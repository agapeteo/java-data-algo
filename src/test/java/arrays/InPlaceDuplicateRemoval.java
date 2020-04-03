package arrays;

import java.util.Arrays;

public class InPlaceDuplicateRemoval {

    public static int remove(Object[] arr) {
        Arrays.sort(arr);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (!arr[j].equals(arr[i])) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i;
    }
}
