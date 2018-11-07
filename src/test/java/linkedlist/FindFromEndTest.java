package linkedlist;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class FindFromEndTest {

    @Test
    void findFromEnd() {
        // given
        LinkedList<Integer> list = new LinkedList<>();
        IntStream.range(0, 20).forEach(i -> list.addLast(i));
        FindFromEnd<Integer> search = new FindFromEnd<>(list);

        // when
        // then
        assertEquals(Integer.valueOf(18), search.findFromEnd(1));
        assertEquals(Integer.valueOf(17), search.findFromEnd(2));
        assertThrows(IllegalArgumentException.class, () -> search.findFromEnd(20));
    }

}