package linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverse() {
        // given
        LinkedList<String> list = new LinkedList<>();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");

        // when
        new ReverseLinkedList<String>().reverse(list.headNode(), list);

        // then
        assertEquals(Arrays.asList("D", "C", "B", "A"), list.elements());
    }

    @Test
    void reverse_recursive() {
        // given
        LinkedList<String> list = new LinkedList<>();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");

        // when
        new ReverseLinkedList<String>().reverseRecursive(list.headNode(), list);

        // then
        assertEquals(Arrays.asList("D", "C", "B", "A"), list.elements());
    }

}