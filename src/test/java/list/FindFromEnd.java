package list;

import list.LinkedList.Node;


public class FindFromEnd<T> {
    private final LinkedList<T> list;

    public FindFromEnd(LinkedList<T> list) {
        this.list = list;
    }

    public T findFromEnd(int n){
        if (n > list.size() - 2) throw new IllegalArgumentException("too large n for list size " + list.size());

        Node<T> frontNode = toFrontNode(list, n);
        Node<T> curNode = list.headNode();

        while (frontNode.next != null){
            frontNode = frontNode.next;
            curNode = curNode.next;
        }

        return curNode.value;
    }

    private Node<T> toFrontNode(LinkedList<T> list, int n) {
        Node<T> result = list.headNode();

        for (int i = 0; i < n; i++){
            result = result.next;
        }

        return result;
    }
}
