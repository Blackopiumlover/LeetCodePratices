/**
 * @author Yongjia
 * @create 2022-06-05-17:12
 */
public class LeetCode744NextGreatestLetter {
    public static void main(String[] args) {

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];
    }
}
