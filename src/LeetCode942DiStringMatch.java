/**
 * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
 *      s[i] == 'I' if perm[i] < perm[i + 1], and
 *      s[i] == 'D' if perm[i] > perm[i + 1].
 * Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
 */
public class LeetCode942DiStringMatch {

    public static void main(String[] args) {
        int[] ans = diStringMatch("III");
        System.out.print("[");
        for (int i : ans) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    public static int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int max = s.length();
        int min = 0;
        int index = 0;
        while (min != max) {
            if (s.charAt(index) == 'I') {
                ans[index] = min;
                index++;
                min++;
            } else {
                ans[index] = max;
                index++;
                max--;
            }
        }
        ans[index] = min;
        return ans;
    }
}