package other;

public class SearchInSortedArray {
    
    static public int findInArray(int[] array, int value){
        if (array == null || array.length == 0) {
            return -1;
        }
        return findInArray(value, array);
//        return findInArrayRecursive(value,0, array.length - 1, array);
    }
    
    static private int findInArrayRecursive(int value, int startIdx, int endIdx, int[] array){
        int range = endIdx - startIdx;

        if (range < 0) return -1;

        int midIdx = ((range / 2)) + startIdx;

        int midValue = array[midIdx];
        if (midValue == value) return midIdx;

        if (value < midValue){
            return findInArrayRecursive(value, startIdx, midIdx - 1, array);
        } else {
            return findInArrayRecursive(value, midIdx + 1, endIdx, array);
        }
    }

    static private int findInArray(int value, int[] array){
        int startIdx = 0;
        int endIdx = array.length -1;

        while (endIdx >= startIdx){
            int range = endIdx - startIdx;
            int midIdx = startIdx + ((range/2));

            if (array[midIdx] == value) return midIdx;

            if (value < array[midIdx]){
                endIdx = midIdx - 1;
            } else {
                startIdx = midIdx + 1;
            }

        }

        return - 1;
    }


}
