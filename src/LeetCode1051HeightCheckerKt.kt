import java.util.*

class LeetCode1051HeightCheckerKt {
    public fun heightChecker(heights: IntArray) : Int {
        val originHeights = heights.clone()
        Arrays.sort(heights)
        var count = 0
        for (i in heights.indices) {
            if (heights[i] != originHeights[i]) {
                count++
            }
        }
        return count
    }
}