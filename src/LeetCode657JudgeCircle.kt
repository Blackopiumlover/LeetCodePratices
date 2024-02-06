fun main(args: Array<String>) {
    println(judgeCircle("UD"))
    println(judgeCircle("LL"))
}

fun judgeCircle(moves: String): Boolean {
    var upCount = 0
    var downCount = 0
    var leftCount = 0
    var rightCount = 0
    moves.forEach {
        when (it) {
            'U' -> upCount++
            'D' -> downCount++
            'L' -> leftCount++
            'R' -> rightCount++
        }
    }
    return upCount == downCount && leftCount == rightCount
}