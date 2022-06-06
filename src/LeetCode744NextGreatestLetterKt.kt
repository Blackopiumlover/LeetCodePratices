/**
@author Yongjia
@create 2022-06-06-11:07
 */
class LeetCode744NextGreatestLetterKt {
    fun main(args : Array<String>) {

    }
    private fun nextGreatestLetter(letters : CharArray, target : Char) : Char {
        for (c in letters) {
            if (c > target) {
                return c
            }
        }
        return letters[0]
    }
}