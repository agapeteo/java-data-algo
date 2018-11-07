package tree;

import java.util.ArrayList;
import java.util.List;

public class UnbalancedBinarySearchTree {
    private Node root;
    
    public static class Node{
        final int value;
        Node left;
        Node right;
        
        public Node(int value){
            this.value = value;
        }
        
        int value(){
            return this.value;
        }
    }

    public boolean contains(int valueToFind){
        if (root == null) return false;

        return contains(root, valueToFind); // todo
    }

    private boolean contains(Node node, int valueToFind){
        if (node.value == valueToFind) return true;

        if (valueToFind < node.value){
            if (node.left == null) return false;
            return contains(node.left, valueToFind);
        } else {
            if (node.right == null) return false;
            return contains(node.right, valueToFind);
        }
    }

    public boolean add(int newValue){
        if (root == null) {
            root = new Node(newValue);
            return false;
        }

        return add(root, newValue);
    }

    private boolean add(Node node, int newValue){

        if (node.value == newValue) return true;

        if (newValue < node.value){
            if (node.left == null){
                node.left = new Node(newValue);
                return false;
            } else {
                return add(node.left, newValue);
            }
        } else {
            if (node.right == null){
                node.right = new Node(newValue);
                return false;
            } else {
                return add(node.right, newValue);
            }
        }
    }

    public List<Integer> elements(){
        List result = new ArrayList();
        elements(root, result);
        return result;
    }

    public List<Integer> orderedElements(){
        List<Integer> list = new ArrayList();

        addElement(root, list);

        return list;
    }

    private void addElement(Node node, List<Integer> list){
        if (node == null) return;

        addElement(node.left, list);
        list.add(node.value);
        addElement(node.right, list);

    }

    private void elements(Node node, List<Integer> list){
        if (node == null) return;

        list.add(node.value);

        elements(node.left, list);
        elements(node.right, list);
    }

    boolean delete(int obj){
        return false; // todo
    }

    public int depth(){
        return depth(root, 0);
    }

    private int depth(Node node, int depth){
        if (node == null) return depth;

        int leftDepth = node.left == null ? depth : depth(node.left, depth + 1);
        int rightDepth = node.right == null ? depth : depth(node.right, depth + 1);

        return Math.max(leftDepth, rightDepth);
    }

    // todo: delete node


    public Node[] toArray(){
        return toArray(root, 0, new Node[elements().size()]);
    }

    public Node[] toArray(Node node, int idx, Node[] array){
        if (node == null) return array;

        array[idx] = node;

        toArray(node.left, 2*idx+1, array);
        toArray(node.right, 2*idx+2, array);

        return array;
    }

    public void rotateRight(){
        Node oldRoot = root;
        Node newRoot = oldRoot.left;
        oldRoot.left = newRoot.right; // swapping with next line will cause
        newRoot.right = oldRoot;
        root = newRoot;
    }


}
