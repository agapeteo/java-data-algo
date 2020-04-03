fun main(args: Array<String>) {
    val items = mutableListOf(3, 1, 2)
    val result = mergeSort(items)
    println(result)


}

fun <T : Comparable<in T>> mergeSort(list: List<T>): List<T> {
    if (list.size < 2) {
        return list
    }
    val left = list.subList(0, list.size / 2)
    val right = if (list.size / 2 > 0) list.subList((list.size / 2), list.size) else listOf()

    return merge(mergeSort(left).toMutableList(), mergeSort(right).toMutableList())
}

private fun <T : Comparable<in T>> merge(left: MutableList<T>, right: MutableList<T>): List<T> {
    val result = mutableListOf<T>()

    while (left.isNotEmpty() or right.isNotEmpty()) {
        result += when {
            left.isNotEmpty() and right.isNotEmpty() -> {
                if (left[0] <= right[0]) {
                    left.removeAt(0)
                } else {
                    right.removeAt(0)
                }
            }
            left.isNotEmpty() -> {
                left.removeAt(0)
            }
            right.isNotEmpty() -> {
                right.removeAt(0)
            }
            else -> throw IllegalStateException()
        }
    }
    return result
}