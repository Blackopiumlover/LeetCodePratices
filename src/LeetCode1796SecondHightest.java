public class LeetCode1796SecondHightest {
    public static void main(String[] args) {
        System.out.println(secondHightest("sjhtz8344"));
        System.out.println(secondHightest("ck077"));
        System.out.println(secondHightest("dfa12321afd"));
        System.out.println(secondHightest("abc1111"));
    }

    public static int secondHightest(String s) {
        int hightest = -1;
        int second = -1;
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (n >= '0' && n <= '9') {
                int number = n - 48;
                if (number > hightest) {
                    second = hightest;
                    hightest = number;
                } else if (number < hightest && number > second) {
                    second = number;
                }
            }
        }
        if (second == hightest) {
            return -1;
        }
        return second;
    }
}
