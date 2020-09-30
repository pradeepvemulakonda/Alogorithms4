fun main() {
    val prime = isPrime(40)
    print(prime)
}

fun isPrime(num: Int): Boolean {
    if(num < 2) return false
    var tempNum = 2
    while (tempNum * tempNum < num ) {
        if(num % tempNum == 0) return false
        tempNum++
    }
    return true
}