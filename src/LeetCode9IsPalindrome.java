public class LeetCode9IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int number = x;
        while(x > 0) {
            int temp = x % 10;
            x = x / 10;
            reverse = reverse * 10 + temp;
        }
        System.out.println(number + " " + reverse);
        return number == reverse;
    }
}
