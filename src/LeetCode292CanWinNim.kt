fun main(args: Array<String>) {
    println(canWinNim(1))
    println(canWinNim(2))
}

fun canWinNim(n: Int): Boolean {
    return n % 4 != 0
}