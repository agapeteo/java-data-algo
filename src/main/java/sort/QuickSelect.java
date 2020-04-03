package sort;

import java.util.List;

public class QuickSelect {

    public static <T extends Comparable<T>> T top(int topIdx, List<T> list) {
        return top(topIdx, list, 0, list.size() - 1);
    }

    private static <T extends Comparable<T>> T top(int topIdx, List<T> list, int lowIdx, int hiIdx) {
        T pivotValue = list.get(hiIdx);
        int i = lowIdx;
        for (int j = i; j < hiIdx; j++) {
            if (list.get(j).compareTo(pivotValue) <= 0) {
                swap(i, j, list);
                i++;
            }
        }
        swap(i, hiIdx, list);

        if (i != topIdx) {
            if (topIdx < i) {
                return top(topIdx, list, lowIdx, i - 1);
            }
            return top(topIdx, list, i + 1, hiIdx);
        }
        return list.get(i);
    }

    private static <T extends Comparable<T>> void swap(int i, int j, List<T> list) {
        T tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
}
