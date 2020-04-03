package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeProblemTest {

    SomeProblem<Integer> sp = new SomeProblem<>();

    @Test
    void simpleReverse() {
        SomeProblem.Tree<Integer> tree = new SomeProblem.Tree<>(10);
        tree.left = new SomeProblem.Tree<>(0);
        tree.right = new SomeProblem.Tree<>(20);
        sp.reverse(tree);

        SomeProblem.Tree<Integer> expectedTree = new SomeProblem.Tree<>(10);
        expectedTree.left = new SomeProblem.Tree<>(20);
        expectedTree.right = new SomeProblem.Tree<>(0);

        assertEquals(tree, expectedTree);
    }

    @Test
    void simpleReverseWithNull() {
        SomeProblem.Tree<Integer> tree = new SomeProblem.Tree<>(10);
        tree.right = new SomeProblem.Tree<>(20);
        sp.reverse(tree);

        SomeProblem.Tree<Integer> expectedTree = new SomeProblem.Tree<>(10);
        expectedTree.left = new SomeProblem.Tree<>(20);

        assertEquals(tree, expectedTree);
    }

    @Test
    void reverse() {
        SomeProblem.Tree<Integer> tree = new SomeProblem.Tree<>(10);
        tree.left = new SomeProblem.Tree<>(0);
        tree.left.left = new SomeProblem.Tree<>(-10);
        tree.left.right = new SomeProblem.Tree<>(5);

        tree.right = new SomeProblem.Tree<>(20);
        tree.right.left = new SomeProblem.Tree<>(10);
        tree.right.right = new SomeProblem.Tree<>(25);

        sp.reverse(tree);

        SomeProblem.Tree<Integer> expectedTree = new SomeProblem.Tree<>(10);
        expectedTree.right = new SomeProblem.Tree<>(0);
        expectedTree.right.right = new SomeProblem.Tree<>(-10);
        expectedTree.right.left = new SomeProblem.Tree<>(5);

        expectedTree.left = new SomeProblem.Tree<>(20);
        expectedTree.left.right = new SomeProblem.Tree<>(10);
        expectedTree.left.left = new SomeProblem.Tree<>(25);

        assertEquals(tree, expectedTree);
    }

    void reverseUnbalanced() {
        SomeProblem.Tree<Integer> tree = new SomeProblem.Tree<>(10);
        tree.left = new SomeProblem.Tree<>(0);
        tree.left.left = new SomeProblem.Tree<>(-10);
        tree.left.left.left = new SomeProblem.Tree<>(-20);
        tree.left.left.left.left = new SomeProblem.Tree<>(-30);


        tree.right = new SomeProblem.Tree<>(20);
        sp.reverse(tree);

        SomeProblem.Tree<Integer> expectedTree = new SomeProblem.Tree<>(10);
        expectedTree.right = new SomeProblem.Tree<>(0);
        expectedTree.right.right = new SomeProblem.Tree<>(-10);
        expectedTree.right.right.right = new SomeProblem.Tree<>(-20);
        expectedTree.right.right.right.right = new SomeProblem.Tree<>(-30);

        expectedTree.left = new SomeProblem.Tree<>(20);

        assertEquals(tree, expectedTree);
    }
}