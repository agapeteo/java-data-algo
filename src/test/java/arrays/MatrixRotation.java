package arrays;


import java.util.Arrays;

public class MatrixRotation {
    private final int[][] matrix;

    public MatrixRotation(int[][] matrix) {
        this.matrix = matrix;
    }

    public void rotateRight() {
        transpose();
        reflect();
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private void transpose() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                swap(i, j);
            }
        }
    }

    private void reflect() {
        for (int i = 0; i < matrix.length; i++) {
            reverseRow(i);
        }
    }

    private void reverseRow(int i) {
        for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
            swapInRow(i, j, k);
        }
    }

    private void swapInRow(int i, int j, int k) {
        final int temp = matrix[i][j];
        matrix[i][j] = matrix[i][k];
        matrix[i][k] = temp;
    }

    private void swap(int i, int j) {
        final int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void main(String[] args) {
        final MatrixRotation mr = new MatrixRotation(new int[][]{{1, 2, 3, 4, 5}, {6, 7 ,8, 9, 10}, {11,12,13,14,15}, {16, 17, 18, 19, 20}, {21,22,23,24,25}});
        System.out.println("Before:");
        mr.printMatrix();
        mr.rotateRight();
        System.out.println("After:");
        mr.printMatrix();
    }
}
