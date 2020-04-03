package tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaxBinaryHeap<E extends Comparable<E>> implements Heap<E> {
    private final List<E> container;

    public MaxBinaryHeap() {
        container = new ArrayList<>();
    }

    @Override
    public E peak() {
        return container.size() > 0 ? container.get(container.size() - 1) : null;
    }

    @Override
    public E pop() {
        if (container.isEmpty()) return null;

        if (container.size() == 1) {
            return container.remove(0);
        }

        E result = container.get(0);
        E latest = container.get(container.size() - 1);
        container.remove(container.size() - 1);
        container.set(0, latest);

        siftDown(0);

        return result;
    }

    private void siftDown(int idx) {
        if (idx < 0 || idx >= container.size() / 2) return;

        int leftIdx = leftChildIdx(idx);
        int rightIdx = rightChildIdx(idx);

        int largerChildIdx;
        if (rightIdx < container.size() && container.get(rightIdx).compareTo(container.get(leftIdx)) > 0) {
            largerChildIdx = rightIdx;
        } else {
            largerChildIdx = leftIdx;
        }

        if (container.get(largerChildIdx).compareTo(container.get(idx)) > 0) {
            swap(idx, largerChildIdx);
            siftDown(largerChildIdx);
        }
    }

    @Override
    public void push(E element) {
        if (element == null) {
            throw new IllegalArgumentException("null values are not valid elements");
        }
        container.add(element);
        siftUp(container.size() - 1);
    }

    private void siftUp(int idx) {
        if (idx <= 0) return;

        int parentIdx = parentIdx(idx);
        if (container.get(idx).compareTo(container.get(parentIdx)) > 0) {
            swap(idx, parentIdx);
            siftUp(parentIdx);
        }
    }

    private void swap(int i, int j) {
        E tmp = container.get(i);
        container.set(i, container.get(j));
        container.set(j, tmp);
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public Collection<E> elements() {
        List<E> result = new ArrayList<>(container.size());
        result.addAll(container);
        return result;
    }

    private int parentIdx(int idx) {
        return (idx - 1) / 2;
    }

    private int leftChildIdx(int idx) {
        return idx * 2 + 1;
    }

    private int rightChildIdx(int idx) {
        return idx * 2 + 2;
    }
}
