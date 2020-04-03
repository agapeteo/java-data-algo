package list;

import java.util.ArrayList;
import java.util.List;

public class ListNode<E> {
    private E value;
    private ListNode next;

    public ListNode(E value) {
        this.value = value;
    }

    public void append(E value) {
        ListNode<E> curNode = this;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = new ListNode(value);
    }

    public List<E> elements() {
        List<E> result = new ArrayList<>();
        ListNode<E> curNode = this;
        while (curNode != null) {
            result.add(curNode.value);
            curNode = curNode.next;
        }
        return result;
    }

    public int size() {
        int size = 0;
        ListNode<E> curNode = this;
        while (curNode != null) {
            size++;
            curNode = curNode.next;
        }
        return size;
    }

    public void removeAt(int idx) {
        int size = size();
        if (size < 2 || idx < 1 || idx >= size) {
            throw new IllegalArgumentException("Illegal idx or list size for removal ");
        }

        if (size == 2) {
            this.next = null;
            return;
        }

        ListNode<E> prevNode = this;
        ListNode<E> curNode = prevNode.next;
        ListNode<E> nextNode = curNode.next;
        int curIdx = 1;

        while (curIdx < idx && nextNode != null) {
            prevNode = prevNode.next;
            curNode = curNode.next;
            nextNode = nextNode.next;
            curIdx++;
        }
        prevNode.next = nextNode;
    }
}
