package list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    public void increasingOrder() {
        // given
        MinStack<Integer> stack = new MinStack<>();

        // when
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // then
        assertEquals(1, stack.min());
    }

    @Test
    public void descreasingOrder() {
        // given
        MinStack<Integer> stack = new MinStack<>();

        // when
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // then
        assertEquals(1, stack.min());
    }

    @Test
    public void increasingAndDecreasingOrder() {
        // given
        MinStack<Integer> stack = new MinStack<>();

        // when
        stack.push(1);
        stack.push(2);
        stack.push(0);
        stack.push(-1);
        stack.push(3);

        // then
        assertEquals(-1, stack.min());
        stack.pop();
        stack.pop();
        assertEquals(0, stack.min());
        stack.pop();
        assertEquals(1, stack.min());
    }

    @Test
    public void increasingAndDecreasingOrderWithDups() {
        // given
        MinStack<Integer> stack = new MinStack<>();

        // when
        stack.push(1);
        stack.push(2);
        stack.push(0);
        stack.push(0);
        stack.push(-1);
        stack.push(3);

        // then
        assertEquals(-1, stack.min());
        stack.pop();
        stack.pop();
        assertEquals(0, stack.min());
        stack.pop();
        assertEquals(0, stack.min());
        stack.pop();
        assertEquals(1, stack.min());
    }
}