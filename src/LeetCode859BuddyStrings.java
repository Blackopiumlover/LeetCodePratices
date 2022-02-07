import java.util.HashSet;
import java.util.Set;

public class LeetCode859BuddyStrings {
    public static void main(String[] args) {
        System.out.println(buddyStrings("abac", "abad"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            if (hasDuplicate(s)) {
                return true;
            } else {
                return false;
            }
        }
        int diffCount = 0;
        int[] diffIndex = new int[] {-1, -1};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (diffIndex[0] == -1) {
                    diffIndex[0] = i;
                } else {
                    diffIndex[1] = i;
                }
                diffCount += 1;
            }
        }
        if (diffCount != 2) {
            return false;
        }
        if (s.charAt(diffIndex[0]) == goal.charAt(diffIndex[1]) && s.charAt(diffIndex[1]) == goal.charAt(diffIndex[0])) {
            return true;
        }
        return false;
    }

    public static boolean hasDuplicate(String s) {
        Set<Character> set = new HashSet<>();
        for (char i : s.toCharArray()) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
