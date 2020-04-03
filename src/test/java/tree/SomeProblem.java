package tree;

import java.util.Objects;

public class SomeProblem<T> {
    static class Tree<T> {
        T data;
        Tree<T> left;
        Tree<T> right;

        Tree(T data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tree<?> tree = (Tree<?>) o;
            return Objects.equals(data, tree.data) && Objects.equals(left, tree.left) && Objects.equals(right, tree.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, left, right);
        }

        @Override
        public String toString() {
            return Objects.toString(data, "nodata") + "l: " + Objects.toString(left, "null") + "r: " + Objects.toString(right, "null");
        }
    }

    public void reverse(Tree<T> tree) {
        if (tree == null) return;
        final Tree<T> tmp = tree.left;
        tree.left = tree.right;
        tree.right = tmp;
        reverse(tree.left);
        reverse(tree.right);
    }
}
