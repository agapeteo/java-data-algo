package linkedlist;

import linkedlist.LinkedList.Node;


public class ReverseLinkedList<T> {

    void reverse(Node<T> head, LinkedList list){
        Node curNode = head;
        Node prev = null;
        Node next = null;

        while(curNode != null){
            next = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = next;
        }

        list.setHeadNode(prev);
    }

    public Node<T> reverseRecursive(Node head, LinkedList list) {
        if (head == null || head.next == null) {
            list.setHeadNode(head);
            System.out.println("exit because head is: " + head.value);
            return head;
        }

        System.out.println("  head next: " + head.next.value);
        Node second = head.next;

        head.next = null; /// !!! runs infinitely without this line

        System.out.println("head: " + head.value + " second: " + second.value);

        Node rest = reverseRecursive(second, list);

        second.next = head;

        System.out.println("after recursion. head: " + head.value + " second: " + second.value);

        return rest;
    }
}
