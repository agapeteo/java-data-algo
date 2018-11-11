package list;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList<E> implements Stack<E>, Queue<E>{
    
    private Node<E> head;
    private Node<E> tail;
    private int size;

    static class Node<E>{
        E value;
        Node<E> next;
        Node(E value){
            this.value = value;
        }

    }

    public LinkedList(){
        this.size = 0;
    }

    @Override
    public void push(E element) {
        addFirst(element);
    }

    @Override
    public E pull() throws NoSuchElementException {
        if (size == 0) throw new NoSuchElementException();

        E result = getFirst();
        deleteFirst();

        return result;
    }

    @Override
    public E peek() throws NoSuchElementException {
        if (size == 0) throw new NoSuchElementException();

        return getFirst();
    }

    @Override
    public void enqueue(E element) {
        addLast(element);
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (size == 0) throw new NoSuchElementException();

        E result = getFirst();
        deleteFirst();

        return result;
    }

    public E get(int index) {
        if (index < 0 || index > size-1) throw new IndexOutOfBoundsException(index + " index, size: " + size);

        E result = null;

        int idx = 0;
        Node<E> currNode = head;

        while (idx <= index){
            if (idx == index) {
                return currNode.value;
            }
            idx++;
            currNode = currNode.next;
        }

        return result;
    }

    public int firstIndexOf(E obj) {
        if (size == 0) return -1;

        Node<E> curNode = head;
        int idx = 0;

        while(idx < size){
            if (curNode.value.equals(obj)){
                return idx;
            }
            idx++;
            curNode = curNode.next;
        }

        return -1;
    }

    public void addLast(E obj) {
        if (createIfEmpty(obj)) return;

        Node currentTail = tail;
        Node newNode = new Node(obj);
        currentTail.next = newNode;
        tail = newNode;

        ++size;
    }

    public E getLast() {
        return tail == null ? null : tail.value;
    }

    public void deleteLast() {
        if (size == 0) return;

        if (size == 1) {
            head = null;
            tail = null;
            return;
        }

        Node<E> curNode = head;
        Node<E> prevNode = null;
        int curIdx = 0;

        while(curIdx < size - 1){
            prevNode = curNode;
            curNode = curNode.next;
            curIdx++;
        }

        prevNode.next = null;
        tail = prevNode;
        curNode = null; // helping GC

        size--;
        return;
    }

    public void addFirst(E obj) {
        if (createIfEmpty(obj)) return;

        Node<E> newNode = new Node<>(obj);
        Node<E> curHead = head;

        newNode.next = curHead;
        head = newNode;
        size++;
    }

    public E getFirst() {
        return head == null ? null : head.value;
    }

    public void deleteFirst() {
        Node<E> currHead = head;
        Node<E> nextHead = currHead.next;

        head = nextHead;
        currHead = null;
    }

    public void insertAfterIndex(int idx, E obj) {
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException("not valid index " + idx + ", current size: " + size);

        int curIdx = 0;
        Node<E> curNode = head;

        while(curIdx < idx){
            curIdx++;
            curNode = curNode.next;
        }

        Node<E> nextNode = curNode.next;
        Node<E> newNode = new Node<>(obj);

        curNode.next = newNode;
        newNode.next = nextNode;

        size++;

        return;
    }

    public List<E> elements() {
        List<E> result = new ArrayList();

        Node<E> currNode = head;
        while (currNode != null){
            result.add(currNode.value);
            currNode = currNode.next;
        }
        return result;
    }

    public Node<E> headNode(){
        return this.head;
    }

    public int size() {
        return this.size;
    }

    private boolean createIfEmpty(E obj) {
        if (head == null && tail == null){
            head = new Node(obj);
            tail = head;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public void setHeadNode(Node<E> node){
        head = node;
    }


}
