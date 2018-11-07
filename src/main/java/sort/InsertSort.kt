

fun <T:Comparable<T>> insertionSort(items:MutableList<T>):List<T>{
    if (items.isEmpty()){
        return items
    }
    for (i in 1 until items.count()){
        val iValue = items[i]
        var j = i
        while (j > 0 && iValue < items[j - 1]){
            items[j] = items[j - 1]
            j -= 1
        }
        items[j] = iValue
    }
    return items
}
fun main(args: Array<String>) {
    val names = mutableListOf("C", "E", "B", "D", "A")
    println(names)
    var ordered = insertionSort(names)
    println(ordered)
    arrayOf(1,2).sort()
}