import java.util.*

fun main() {
   inefficientReverse()
    efficientReverse()
}

fun inefficientReverse() {
    val x: IntArray = intArrayOf(11, 2, 33, 6, 1, 7, 0)
    val y = IntArray(x.size)
    val size = x.size
    for((index, value) in x.withIndex()) {
        y[size - index - 1] = value
    }
    print("new array is ${y.contentToString()}")
}

fun efficientReverse() {
    val x: IntArray = intArrayOf(11, 2, 33, 6, 1, 7, 0)
    val size = x.size
    for(i in 0 until size/2) {
        val temp = x[i]
        x[i] = x[size - i - 1]
        x[size -i - 1] = temp
    }
    println("reversed array ${x.contentToString()}")

}



