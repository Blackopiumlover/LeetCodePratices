fun main(args: Array<String>) {
    println(majorityElement3(intArrayOf(3, 3, 4)))
}

// HashMap
fun majorityElement1(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    nums.forEach {
        if (!map.containsKey(it)) {
            map[it] = 1
        } else {
            map[it] = map[it]!! + 1
        }
    }
    map.forEach { (t, u) ->
        if (u > nums.size / 2) {
            return t
        }
    }
    return -1
}

// Sort
fun majorityElement2(nums: IntArray): Int {
    return nums.sortedArray()[nums.size / 2]
}

// Boyer-Moore
fun majorityElement3(nums: IntArray): Int {
    var count = 0
    var candidate = -1
    nums.forEach {
        if (count == 0) {
            candidate = it
        }
        count += if (it == candidate) { 1 } else { -1 }
    }
    return candidate
}