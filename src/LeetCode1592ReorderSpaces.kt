fun main(args: Array<String>) {
    println(reorderSpaces("  this   is  a sentence "))
    println(reorderSpaces(" practice   makes   perfect"))
    println(reorderSpaces("hello   world"))
    println(reorderSpaces("  walks  udp package   into  bar a"))
    println(reorderSpaces("a"))
    println(reorderSpaces("  hello"))
}

fun reorderSpaces(text: String): String {
    var spaceCount = 0
    var word = ""
    val words = mutableListOf<String>()
    text.forEach {
        if (it == ' ') {
            spaceCount++
            if (word.isNotEmpty()) {
                words.add(word)
                word = ""
            }
        } else {
            word += it
        }
    }
    if (word.isNotEmpty()) {
        words.add(word)
    }
    if (words.size == 1) {
        return if (spaceCount == 0) {
            words[0]
        } else {
            var result = words[0]
            for (i in 0 until spaceCount) {
                result += " "
            }
            result
        }
    }

    val gapSpaceCount = spaceCount / (words.size - 1)
    val endSpaceCount = spaceCount % (words.size - 1)

    var result = ""
    words.forEachIndexed { index, it ->
        result += it
        if (index != words.size - 1) {
            for (i in 0 until gapSpaceCount) {
                result += " "
            }
        }
    }
    for (i in 0 until endSpaceCount) {
        result += " "
    }
    return result
}