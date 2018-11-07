package tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UnbalancedBinarySearchTreeTest {

    @Test
    void contains() {
        fail("todo");
    }

    @Test
    void add() {
        UnbalancedBinarySearchTree tree = new UnbalancedBinarySearchTree();

        tree.add(50);
        tree.add(70);
        tree.add(30);

        tree.add(60);
        tree.add(60);
        tree.add(80);
        tree.add(10);
        tree.add(100);
        tree.add(40);

//        System.out.println(tree.elements());
        System.out.println(tree.orderedElements());


        contains(49, tree);
        contains(50, tree);
        contains(51, tree);

        contains(69, tree);
        contains(70, tree);
        contains(71, tree);

        contains(29, tree);
        contains(30, tree);
        contains(31, tree);

        contains(79, tree);
        contains(80, tree);
        contains(81, tree);

        contains(9, tree);
        contains(10, tree);
        contains(11, tree);

        contains(99, tree);
        contains(100, tree);
        contains(101, tree);

        contains(39, tree);
        contains(40, tree);
        contains(41, tree);

    }

    @Test
    public void depth(){
        // given
        UnbalancedBinarySearchTree tree = new UnbalancedBinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(2);
        tree.add(4);
        tree.add(1);
        tree.add(6);
        tree.add(9);

        System.out.println("depth: " + tree.depth()); // should be 3;


    }

    @Test
    public void toArray(){
        UnbalancedBinarySearchTree tree = new UnbalancedBinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(2);
        tree.add(4);
        tree.add(1);
        tree.add(6);
        tree.add(9);

        UnbalancedBinarySearchTree.Node[] array = tree.toArray();

        Arrays.asList(array).forEach(i -> System.out.println(i.value));
    }

    @Test
    public void rotateRight(){
        UnbalancedBinarySearchTree tree = new UnbalancedBinarySearchTree();
        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(2);
        tree.add(4);
        tree.add(1);
        tree.add(6);
        tree.add(9);

        System.out.println("before: " + tree.elements());
        tree.rotateRight();

        System.out.println("after: " + tree.elements());
    }

    void contains(int number, UnbalancedBinarySearchTree tree){
        System.out.println("contains " + number + ": " + tree.contains(number));
    }

    @Test
    void elements() {
        fail("todo");
    }

    @Test
    void delete() {
        fail("todo");
    }
}