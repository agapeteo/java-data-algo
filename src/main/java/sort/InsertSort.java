package sort;

import java.util.Arrays;

public class InsertSort {

//    public static void sort(int[] array){
//        for (int i = 1; i < array.length; i++){
//            int value = array[i];
//            for (int j = 0; j < i; j++){
//                if (array[j] > value){
//                    int sourcePosition = j;
//                    System.arraycopy(array, sourcePosition, array, j+1, i -j);
//                    array[j] = value;
//                    break;
//                }
//            }
//        }
//    }

        static void sort(int[] array){
            for (int i = 1; i < array.length; i++){
                int iValue = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > iValue){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = iValue;
            }
        }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,1,4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


}
