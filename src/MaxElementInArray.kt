
fun main() {
    val x: IntArray = intArrayOf(11, 2, -34, 6, 1, 7, 0)
    var maxVal = x[0]
    for(i in x) {
        if(i > maxVal)
            maxVal = i
    }
    print("max is $maxVal")
}
