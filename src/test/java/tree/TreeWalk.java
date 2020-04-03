package tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeWalk<T> {

    private static final class Perimeter<T> {
        final List<T> nodes;
        final boolean isLeft;

        Perimeter(boolean isLeft) {
            this.isLeft = isLeft;
            this.nodes = new ArrayList<>();
        }

        Perimeter(List<T> nodes, boolean isLeft) {
            this.isLeft = isLeft;
            this.nodes = nodes;
        }

        void add(T data) {
            nodes.add(data);
        }

        Perimeter<T> reverse() {
            List<T> reversedNodes = new ArrayList<>(nodes);
            Collections.reverse(reversedNodes);
            return new Perimeter<>(reversedNodes, !isLeft);
        }

        Perimeter<T> append(Perimeter<T> that) {
            List<T> nodesCopy = new ArrayList<>(nodes);
            nodesCopy.addAll(that.nodes);
            return new Perimeter<>(nodesCopy, isLeft && that.isLeft);
        }

        void print() {
            nodes.forEach(System.out::println);
        }
    }

    private static class Tree<T> {
        T data;
        Tree<T> left;
        Tree<T> right;

        Tree(T data) {
            this.data = data;
        }
    }

    public void print(Perimeter<T> perimeter) {
        perimeter.print();
    }

    public Perimeter<T> perimeter(final Tree<T> tree) {
        Perimeter<T> leftSubperimeter = new Perimeter<>(true);
        leftSubperimeter.add(tree.data);
        Perimeter<T> rightSuberimeter = new Perimeter<>(false);
        leftSubperimeter = walkSubtree(tree.left, true, true, leftSubperimeter);
        rightSuberimeter = walkSubtree(tree.right, true, false, rightSuberimeter);
        return leftSubperimeter.append(rightSuberimeter.reverse());
    }

    private Perimeter<T> addToSubperimeter(Perimeter<T> subperimeter, Tree<T> tree, boolean parentInPerimeter) {
        if (parentInPerimeter) {
            subperimeter.add(tree.data);
        }
        Perimeter<T> subL = walkSubtree(tree.left, parentInPerimeter, true, subperimeter);
        return walkSubtree(tree.right, parentInPerimeter, false, subL);

    }

    private Perimeter<T> walkSubtree(final Tree<T> tree, boolean parentInPerimeter, boolean isLeftChild, Perimeter<T> subperimeter) {
        if (tree == null) {
            return subperimeter;
        }

        if (tree.left == null && tree.right == null) {
            subperimeter.add(tree.data);
            return subperimeter;
        }

        if (!parentInPerimeter) {
            return subperimeter;
        }

        if (subperimeter.isLeft) {
            return addToSubperimeter(subperimeter, tree, isLeftChild);
        }

        return addToSubperimeter(subperimeter, tree, !isLeftChild);
    }


    public static void main(String[] args) {
        TreeWalk<Integer> tw = new TreeWalk<>();
        Tree<Integer> tree = new Tree<>(5);
        tree.left = new Tree<>(4);
        tree.left.left = new Tree<>(3);
        tree.left.left.left = new Tree<>(2);
        tree.left.left.right = new Tree<>(8);
        tree.left.left.right.right = new Tree<>(9);
        tree.right = new Tree<>(6);
        tw.print(tw.perimeter(tree));
    }
}
