fun main(args: Array<String>) {
    val nums1 = IntArray(3).apply {
        set(0, 4)
        set(1, 1)
        set(2, 3)
    }

    val nums2 = IntArray(2).apply {
        set(0, 5)
        set(1, 7)
    }

    val nums3 = IntArray(4).apply {
        set(0, 3)
        set(1, 5)
        set(2, 2)
        set(3, 6)
    }

    val nums4 = IntArray(3).apply {
        set(0, 3)
        set(1, 1)
        set(2, 7)
    }
    print(minNumber(nums3, nums4))
}

fun minNumber(nums1: IntArray, nums2: IntArray): Int {
    val min1: Int
    val min2: Int
    var minCommon = 10
    nums1.forEach { number1 ->
        nums2.forEach { number2 ->
            if (number1 == number2) {
                minCommon = minOf(minCommon, number1)
            }
        }
    }
    return if (minCommon == 10) {
        min1 = nums1.minOf { it }
        min2 = nums2.minOf { it }
        minOf(min1, min2) * 10 + maxOf(min1, min2)
    } else {
        minCommon
    }
}