package list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    public void appendAndElementsAndSize() {
        // given
        ListNode<Integer> node = new ListNode<>(0);

        // when
        node.append(1);
        node.append(2);
        node.append(3);
        node.append(4);

        // then
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4);
        assertEquals(expected, node.elements());
        assertEquals(expected.size(), node.size());
    }

    @Test
    public void removeAt(){
        // given
        ListNode<Integer> node = new ListNode<>(0);
        node.append(1);
        node.append(2);
        node.append(3);
        node.append(4);

        // when
        node.removeAt(3);

        // then
        List<Integer> expected = Arrays.asList(0, 1, 2, 4);
        assertEquals(expected, node.elements());
    }

}