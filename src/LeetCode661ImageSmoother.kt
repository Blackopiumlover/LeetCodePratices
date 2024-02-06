import kotlin.math.floor

fun main(args: Array<String>) {
    println(
        imageSmoother(
            arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1)
            )
        )
    )

    println(
        imageSmoother(
            arrayOf(
                intArrayOf(100, 200, 100),
                intArrayOf(200, 50, 200),
                intArrayOf(100, 200, 100)
            )
        )
    )
}

// 遍历数组，只统计符合要求的数组点，分别计算点的数量和求和
fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
    val result = Array(img.size) { IntArray(img[0].size) }
    for (i in img.indices) {
        for (j in img[0].indices) {
            var sum = 0
            var count = 0
            for (x in i - 1 .. i + 1) {
                for ( y in j - 1 .. j + 1) {
                    if (x >= 0 && x < img.size && y >= 0 && y < img[0].size) {
                        count++
                        sum += img[x][y]
                    }
                }
            }
            result[i][j] = floor((sum / count).toFloat()).toInt()
            print(result[i][j].toString() + " ")
        }
        println()
    }
    return result
}