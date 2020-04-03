package arrays;

import java.util.List;

public class Kadane {
    public static int maxSum(List<Integer> list) {
        int result = 0;
        int curSum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (curSum + list.get(i) > 0) {
                curSum += list.get(i);
                if (curSum > result) {
                    result = curSum;
                }
            } else {
                curSum = 0;
            }
        }
        return result;
    }
}
