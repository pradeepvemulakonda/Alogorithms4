
fun main() {
    val x: IntArray = intArrayOf(11, 2, 33, 6, 1, 7, 0)
    var sum = 0.0
    for(i in x) {
        sum += i
    }
    val average: Double = sum/x.size
    print("average is $average")
}
