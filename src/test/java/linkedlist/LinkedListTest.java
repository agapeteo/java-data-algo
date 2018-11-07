package linkedlist;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LinkedListTest {

    @Test
    public void testEmpty(){
        // given
        // when
        LinkedList actual = new LinkedList();

        // then
        assertEquals(0, actual.size());
        assertEquals(null, actual.getFirst());
        assertEquals(null, actual.getLast());
    }

    @Test
    public void testList(){
        // given
        LinkedList list = new LinkedList();

        // when
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        // then
        assertEquals(3, list.size());
        assertEquals(1, list.getFirst());
        assertEquals(3, list.getLast());
        assertEquals(2, list.get(1));
    }

    @Test
    public void testList_getByIndex(){
        // given
        LinkedList list = new LinkedList();

        // when
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        // then
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testList_getByIndex_empty(){
        // given
        LinkedList list = new LinkedList();

        // when

        // then
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });
    }

    @Test
    public void getByIndex(){
        // given
        LinkedList list = new LinkedList();

        // when
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        // then
        assertEquals(0, list.firstIndexOf(1));
        assertEquals(1, list.firstIndexOf(2));
        assertEquals(2, list.firstIndexOf(3));
        assertEquals(-1, list.firstIndexOf(4));
    }

    @Test
    public void insertAfterIndex(){
        // given
        LinkedList list = new LinkedList();

        // when
        list.addLast(1);
        list.addLast(3);
        list.insertAfterIndex(0, 2);

        // then
        assertEquals(Arrays.asList(1, 2, 3), list.elements());
    }

    @Test
    public void insertAfterIndex_multiple(){
        // given
        LinkedList list = new LinkedList();

        // when
        list.addLast(1);
        list.addLast(4);
        list.insertAfterIndex(0, 2);
        list.insertAfterIndex(1, 3);
        list.insertAfterIndex(3, 5);

        // then
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), list.elements());
    }

    @Test
    public void deleteLast(){
        // given
        LinkedList list = new LinkedList();
        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        // when
        list.deleteLast();
        list.deleteLast();

        // when

        // then
        assertEquals(Arrays.asList(0, 1), list.elements());
    }

    @Test
    public void deleteLast_inEmpty(){
        // given
        LinkedList list = new LinkedList();
        list.addLast(0);

        // when
        list.deleteLast();
        list.deleteLast();

        // when

        // then
        assertEquals(Arrays.asList(), list.elements());
    }

    @Test
    public void deleteLast_addAndDelete(){
        // given
        LinkedList list = new LinkedList();
        list.addLast(0);

        // when
        list.deleteLast();
        list.addLast(1);

        // when

        // then
        assertEquals(Arrays.asList(1), list.elements());
    }

    @Test
    public void deleteFirst(){
        // given
        LinkedList list = new LinkedList();
        list.addLast(0);
        list.addLast(1);

        // when
        list.deleteFirst();

        // then
        assertEquals(Arrays.asList(1), list.elements());
    }

    @Test
    public void addFirst(){
        // given
        LinkedList list = new LinkedList();

        // when
        list.addLast(3);
        list.addFirst(2);
        list.addFirst(1);

        // then
        assertEquals(Arrays.asList(1, 2, 3), list.elements());
    }

    @Test
    public void addFirst_empty(){
        // given
        LinkedList list = new LinkedList();

        // when
        list.addFirst(1);

        // then
        assertEquals(Arrays.asList(1), list.elements());
    }

    @Test
    public void factorial(){
        int number = 5;

        System.out.println(factorial(number));
    }

    private int factorial(int n) {
        if (n <= 1) return 1;

        int factorial = 2;
        int current = 3;
        while (current <= n){
            factorial = factorial * current;
            current++;
        }
        return factorial;
    }






}