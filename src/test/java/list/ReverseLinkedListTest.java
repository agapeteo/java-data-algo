package list;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
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

    @Test
    void calc(){
        System.out.println(32_100*0.93);
        System.out.println(new BigDecimal("32100.00").multiply(new BigDecimal("0.93"), MathContext.DECIMAL128));
        System.out.println(new BigDecimal("32100.00").divide(new BigDecimal("1.07"), MathContext.DECIMAL128));
        System.out.println(new BigDecimal("200").divide(new BigDecimal("1.05"), MathContext.DECIMAL32));
        System.out.println(new BigDecimal("200").multiply(new BigDecimal("0.95"), MathContext.DECIMAL128));
    }

}