fun main(args: Array<String>) {
    println(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    return if (x < 0) {
        false
    } else {
        var temp = x
        var reverse = 0
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10
            temp /= 10
        }
        reverse == x
    }
}