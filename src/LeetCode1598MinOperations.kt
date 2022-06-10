/**
 * @author Yongjia
 * @create 2022-06-09-3:23
 */
object LeetCode1598MinOperations {
    @JvmStatic
    fun main(args: Array<String>) {
        val step1 = minOperations(
            arrayOf(
                "d1/", "d2/", "../", "d21/", "./"
            )
        )
        println(step1)
        val step2 = minOperations(
            arrayOf(
                "d1/", "d2/", "./", "d3/", "../", "d31/"
            )
        )
        println(step2)
        val step3 = minOperations(
            arrayOf(
                "d1/", "../", "../", "../"
            )
        )
        println(step3)
    }

    fun minOperations(logs: Array<String>): Int {
        val stack: MutableList<String> = ArrayList()
        stack.add("Main")
        for (s in logs) {
            if (s == "../") {
                if (stack.size != 1) {
                    stack.removeAt(stack.size - 1)
                }
            } else if (s != "./") {
                stack.add(s)
            }
        }
        return stack.size - 1
    }
}