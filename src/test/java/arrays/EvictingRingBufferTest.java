package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EvictingRingBufferTest {


    @Test
    public void test() {
        EvictingRingBuffer<Integer> buffer = new EvictingRingBuffer(3);

        // when
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4);
        buffer.enqueue(5);
        buffer.enqueue(6);
        buffer.enqueue(7);

        int actual = buffer.dequeue();

        // then
        assertEquals(Arrays.asList(6, 7), buffer.elements());
        assertEquals(5, actual);

    }

}