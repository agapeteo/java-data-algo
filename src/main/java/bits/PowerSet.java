package bits;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static <T> List<List<T>> powerSet(List<T> inputSet) {
        List<List<T>> powerSet = new ArrayList<>();
        int max = 1 << inputSet.size(); // 2^n, where n is size of inputSet

        for (int intNumber = 0; intNumber < max; intNumber++) {
            List<T> curSet = toSubset(intNumber, inputSet);
            powerSet.add(curSet);
        }
        return powerSet;
    }

    private static <T> List<T> toSubset(int intNumber, List<T> inputSet) {
        List<T> subSet = new ArrayList<>();
        int idx = -1;
        for (int bits = intNumber; bits > 0; bits >>= 1) {
            idx++;

            if ((bits & 1) != 1) continue; // cur bit is 0

            subSet.add(inputSet.get(idx));
        }
        return subSet;
    }
}
