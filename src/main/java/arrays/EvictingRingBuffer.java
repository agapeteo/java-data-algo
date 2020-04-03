package arrays;

import list.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class EvictingRingBuffer<E> implements Queue<E> {
    private final int maxSize;
    private final ArrayList<E> container;

    private int writeIdx = 0;
    private int readIdx = 0;
    private int count = 0;

    public EvictingRingBuffer(int maxSize) {
        this.maxSize = maxSize;

        container = new ArrayList(Arrays.asList(new Object[maxSize]));
    }

    @Override
    public void enqueue(E element) {
        container.set(writeIdx, element);
        writeIdx = increment(writeIdx);
        if (count == maxSize) {
            readIdx = writeIdx;
        } else {
            count++;
        }
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (count == 0) throw new NoSuchElementException();

        E result = container.get(readIdx);

        readIdx = increment(readIdx);
        count--;

        return result;
    }

    public List<E> elements() {
        List<E> result = new ArrayList<>(maxSize);

        int curIdx = readIdx;
        for (int i = 0; i < count; curIdx = increment(curIdx), i++) {
            result.add(container.get(curIdx));
        }
        return result;
    }

    private int increment(int idx) {
        return (idx + 1) % container.size();
    }

}
