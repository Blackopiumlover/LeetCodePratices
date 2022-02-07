public class LeetCode520DetectCapitalUse {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }
        boolean firstCapital = word.charAt(0) < 97;
        boolean allUpper = true;
        boolean allLower = true;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < 97) {
                allLower = false;
            } else {
                allUpper = false;
            }
        }
        if (firstCapital && allLower) {
            return true;
        }
        if (firstCapital && allUpper) {
            return true;
        }
        return !firstCapital && allLower;
    }
}
