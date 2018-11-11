package list;

import java.util.NoSuchElementException;

public interface Stack<E> {

    void push(E element);

    E pull() throws NoSuchElementException;

    E peek() throws NoSuchElementException;

}
