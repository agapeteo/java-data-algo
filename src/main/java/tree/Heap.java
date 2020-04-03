package tree;

import java.util.Collection;

public interface Heap<E extends Comparable<E>> {
    E peak();

    E pop();

    void push(E element);

    int size();

    Collection<E> elements();

}
