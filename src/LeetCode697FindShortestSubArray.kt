fun main(args: Array<String>) {
    println(findShortestSubArray(
        intArrayOf(1, 2, 2, 3, 1)
    ))

    println(findShortestSubArray(
        intArrayOf(1, 2, 2, 3, 1, 4, 2)
    ))
}

fun findShortestSubArray(nums: IntArray): Int {
    val map = HashMap<Int, IntArray>()
    // 用一个 HashMap 来计数，
    // Key 为 nums[i] 这个元素，
    // Value 为一个数组，
    // value[0] 为 nums[i] 出现的次数，
    // values[1] 为 nums[i] 第一次出现的 index
    // values[2] 为 nums[i] 最后一次出现 index
    // values[2] - values[1] + 1 即是包含 nums[i] 的子集的长度
    nums.forEachIndexed { index, i ->
        if (!map.containsKey(i)) {
            map[i] = intArrayOf(1, index, index)
        } else {
            map[i]!![0]++
            map[i]!![2] = index
        }
    }
    var maxCount = -1
    var minLength = -1
    map.forEach {
        if (maxCount < it.value[0]) {
            maxCount = it.value[0]
            minLength = it.value[2] - it.value[1] + 1
        } else if (maxCount == it.value[0]) {
            minLength = minOf(minLength, (it.value[2] - it.value[1] + 1))
        }
    }
    return minLength
}