package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InPlaceDuplicateRemovalTest {

    @Test
    void remove() {
        // given
        String[] arr = new String[]{"c", "a", "c", "a", "d", "a"};

        // when
        int actual = InPlaceDuplicateRemoval.remove(arr);

        // then
//        System.out.println(Arrays.toString(arr));
        assertEquals(2, actual);
        assertEquals(Arrays.asList("a", "c", "d", "c", "c", "d"), Arrays.asList(arr));
    }
}