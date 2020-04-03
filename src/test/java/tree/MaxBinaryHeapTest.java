package tree;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MaxBinaryHeapTest {

    @Test
    public void simple() {
        List<Integer> list = Arrays.asList(10, 5, 3, 30, 25, 2, 0, -1, 200);

        Heap<Integer> heap = new MaxBinaryHeap<>();
        list.forEach(i -> heap.push(i));

        List<Integer> actual = new ArrayList<>(list.size());
        while(heap.size() > 0) {
            actual.add(heap.pop());
        }

        Collections.sort(list, Comparator.reverseOrder());
        assertEquals(list, actual);
    }

}