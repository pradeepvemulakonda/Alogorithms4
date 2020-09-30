fun main() {
    val x: IntArray = intArrayOf(11, 2, 33, 6, 1, 7, 0)
    val y = IntArray(x.size)
    for((index, value) in x.withIndex()) {
        y[index] = value
    }
    print("new array is ${x.toString()}")
}
