package tree;

import java.util.ArrayList;
import java.util.List;

public class UnbalancedBinarySearchTree<E extends Comparable<E>> {
    static class Node<E> {
        E value;
        Node<E> left;
        Node<E> right;

        Node(E value) {
            this.value = value;
        }
    }

    private Node<E> root;

    public void add(E value) {
        if (root == null) {
            root = new Node<>(value);
            return;
        }
        addToRootNode(root, value);
    }

    private void addToRootNode(Node<E> rootNode, E value) {
        if (value.compareTo(rootNode.value) <= 0) {
            if (rootNode.left == null) {
                rootNode.left = new Node<>(value);
            } else {
                addToRootNode(rootNode.left, value);
            }
        } else {
            if (rootNode.right == null) {
                rootNode.right = new Node<>(value);
            } else {
                addToRootNode(rootNode.right, value);
            }
        }
    }

    public boolean contains(E value) {
        return rootNodeContains(root, value);
    }

    private boolean rootNodeContains(Node<E> rootNode, E value) {
        if (rootNode == null) return false;

        if (value == rootNode.value) return true;

        if (value.compareTo(rootNode.value) < 0) {
            return rootNodeContains(rootNode.left, value);
        } else {
            return rootNodeContains(rootNode.right, value);
        }
    }

    public List<E> elementsSorted() {
        List<E> result = new ArrayList<>();
        appendSortedForRootNode(root, result);
        return result;
    }

    private void appendSortedForRootNode(Node<E> rootNode, List<E> elements) {
        if (rootNode == null) return;

        appendSortedForRootNode(rootNode.left, elements);
        elements.add(rootNode.value);
        appendSortedForRootNode(rootNode.right, elements);
    }

    public int depth() {
        return depthFromNode(root, 0);
    }

    private int depthFromNode(Node<E> node, int curDepth) {
        if (node == null || (node.left == null && node.right == null)) {
            return curDepth;
        }

        return Math.max(
                depthFromNode(node.left, curDepth + 1),
                depthFromNode(node.right, curDepth + 1)
        );
    }

    public static <T> UnbalancedBinarySearchTree sortedArrayToTree(T[] sortedArray) {
        UnbalancedBinarySearchTree tree = new UnbalancedBinarySearchTree();
        tree.root = sortedArrayToTree(sortedArray, 0, sortedArray.length);
        return tree;
    }

    private static <T> Node sortedArrayToTree(T[] sortedArray, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return null;

        int midIdx = startIdx + (endIdx - startIdx) / 2;
        Node<T> node = new Node<>(sortedArray[midIdx]);
        node.left = sortedArrayToTree(sortedArray, startIdx, midIdx);
        node.right = sortedArrayToTree(sortedArray, midIdx + 1, endIdx);

        return node;
    }


}
