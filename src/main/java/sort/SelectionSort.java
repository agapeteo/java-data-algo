package sort;

public class SelectionSort {

    public void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if (array[j] < array[i]){
                    swap(array, i, j);
                }
            }
        }
    }

    public void sortRecursive(int[] array){
        sortRecursive(array, 0);
    }

    private void sortRecursive(int[] array, int curIndex){
        if (curIndex >= array.length - 1) return;

        swap(array, curIndex, findMinIndex(curIndex, array));
        sortRecursive(array, curIndex + 1);
    }

    private void swap(int[] array, int curIndex, int minIndex) {
        if (curIndex == minIndex) return;

        int curValue = array[curIndex];
        array[curIndex] = array[minIndex];
        array[minIndex] = curValue;
    }

    private int findMinIndex(int curIndex, int[] array) {
        int minPos = curIndex;

        for (int i = curIndex + 1; i < array.length; ++i){
            if (array[i] < array[curIndex]){
                minPos = i;
            }
        }

        return minPos;
    }


}
