/**
@author Yongjia
@create 2022-05-10-19:54
 */
class LeetCode713NumSubarrayProductLessThanKKt {

    fun numSubarrayProductLessThanK(nums : IntArray, k : Int) : Int {
        if (k <= 1) {
            return 0
        }
        var left = 0
        var right = 0
        var count = 0
        var product = 1
        while (right < nums.size) {
            product *= nums[right]
            while (product >= k) {
                product /= nums[left]
                left++
            }
            count += (right - left) + 1
            right++
        }
        return count
    }
}