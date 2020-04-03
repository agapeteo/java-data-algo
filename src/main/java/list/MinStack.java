package list;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack<E extends Comparable<E>> {
    private final Deque<E> stack;
    private final Deque<E> minStack;

    public MinStack() {
        this.stack = new LinkedList<>();
        this.minStack = new LinkedList<>();
    }

    public E pop() {
        E result = stack.pop();
        if (result.equals(minStack.peek())) {
            minStack.pop();
        }
        return result;
    }

    public void push(E value) {
        if (minStack.isEmpty() || value.compareTo(minStack.peek()) <= 0) {
            minStack.push(value);
        }
        stack.push(value);
    }

    public E min() {
        return minStack.peek();
    }
}
