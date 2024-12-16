fun main() {
    //Demonstrates how to handle iteration of list and sets more explicitly.
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iteratorList = list.iterator()
    while (iteratorList.hasNext()) {
        val element = iteratorList.next()
        if (element > 2) {
            iteratorList.remove()
        }
    }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val iteratorSet = set.iterator()
    while (iteratorSet.hasNext()) {
        val element = iteratorSet.next()
        if (element > 2) {
            iteratorSet.remove()
        }
    }
    println(set) // Output: [1, 2]
} 