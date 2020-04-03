package sort

import java.util.*


fun <T:Comparable<T>> quickSort(items: List<T>): List<T>{
    if (items.count() < 2){
        return items
    }
    val pivot = items[items.count()/2]
    val equal = items.filter { it == pivot }
    val less = items.filter { it < pivot }
    val greater = items.filter { it > pivot }
    return quickSort(less) + equal + quickSort(greater)
}

fun quickSortArray(array: Array<Int>, leftIdx: Int = 0, rightIdx: Int = array.size - 1){
    if (leftIdx >= rightIdx) return

    val midIdx = (rightIdx + leftIdx)/2
    val pivot = array[midIdx]
    val index = partition(array, leftIdx, rightIdx, pivot)
    quickSortArray(array, leftIdx, index - 1)
    quickSortArray(array, index, rightIdx)
}

fun partition(array: Array<Int>, leftIdx: Int, rightIdx: Int, pivotValue: Int): Int {
    var i = leftIdx
    var j = rightIdx

    while(i <= j){
        while(array[i] < pivotValue){
            i++
        }
        while(array[j] > pivotValue){
            j--
        }
        if (i <= j){
            val tmp = array[i]
            array[i] = array[j]
            array[j] = tmp
            i++
            j--
        }
    }
    return i
}



fun main(args: Array<String>) {
//    println("\nOriginal list:")
//    val names = listOf("Z", "C", "B", "A", "D")
//    println(names)
//    println("\nOrdered list:")
//    val ordered =  quickSort(names)
//    println(ordered)

    println("\nOriginal list:")
    val numbers = arrayOf(4,2,7,3)
    println(Arrays.toString(numbers))
    println("\nOrdered list:")
    quickSortArray(numbers)
    println(Arrays.toString(numbers))
}