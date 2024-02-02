fun main(args: Array<String>) {
    println(specialArray(intArrayOf(3, 5)))
    println(specialArray(intArrayOf(0, 0)))
    println(specialArray(intArrayOf(0, 4, 3, 0, 4)))
    println(specialArray(intArrayOf(3, 6, 7, 7, 0)))
}

fun specialArray(nums: IntArray): Int {
    for (i in 0 .. nums.size) {
        var count = 0
        nums.forEachIndexed { index, _ ->
            if (nums[index] >= i) {
                count++
            }
        }
        if (count == i) {
            return count
        }
    }
    return -1
}