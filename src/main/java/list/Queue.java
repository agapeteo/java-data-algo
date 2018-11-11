package list;

import java.util.NoSuchElementException;

public interface Queue<E> {

    void enqueue(E element);

    E dequeue() throws NoSuchElementException;

}
