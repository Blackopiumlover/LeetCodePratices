class LeetCode942DiStringMatchKt {

    fun main(args: Array<String>) {
        val ans = diStringMatch("IDID")
        print("[")
        for (i in ans) {
            print("$i, ")
        }
        println("]")
    }

    private fun diStringMatch(s: String): IntArray {
        val ans = IntArray(s.length + 1)
        var max = s.length
        var min = 0
        var index = 0
        while (min != max) {
            if (s[index] == 'I') {
                ans[index] = min
                index++
                min++
            } else {
                ans[index] = max
                index++
                max--
            }
        }
        ans[index] = min
        return ans
    }
}