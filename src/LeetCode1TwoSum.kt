fun main(args: Array<String>) {
    twoSum(intArrayOf(2, 7, 11, 15), 9)
    twoSum(intArrayOf(3, 2, 4), 6)
    twoSum(intArrayOf(3, 3), 6)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { i, _ ->
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                println(i)
                println(j)
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

fun twoSum1(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { index, i ->
        if (map.containsKey(target - i)) {
            return intArrayOf(index, map.getOrDefault(target - i, -1))
        } else {
            map[i] = index
        }
    }
    return intArrayOf()
}