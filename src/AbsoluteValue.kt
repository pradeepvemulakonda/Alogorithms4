fun main() {
    println(abs(-4))
    println(abs(3))
    println(abs(-0.45))
}

fun  abs(value: Int): Int {
    return if (value < 0) -value else value
}

fun  abs(value: Double): Double {
    return if (value < 0.0) -value else value
}