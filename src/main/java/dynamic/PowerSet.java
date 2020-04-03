package dynamic;

import java.util.*;

public class PowerSet {
    public static <T> List<List<T>> powerSet(List<T> inputSet) {
        List<List<T>> powerSet = new ArrayList<>();

        for (T inputElement: inputSet) {
            ListIterator<List<T>> psIterator = powerSet.listIterator();
            while (psIterator.hasNext()) {
                List<T> curList = new ArrayList<>(psIterator.next());
                curList.add(inputElement);
                psIterator.add(curList);
            }
            powerSet.add(Arrays.asList(inputElement));
        }
        powerSet.add(Collections.emptyList());
        return powerSet;
    }
}
