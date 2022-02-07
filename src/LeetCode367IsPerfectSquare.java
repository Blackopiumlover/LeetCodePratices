public class LeetCode367IsPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(2147483467));
    }

    public static boolean isPerfectSquare(int num) {
        int min = 0;
        int max = num;
        while (min <= max) {
            int mid = min + ((max - min) >> 1);
            long square = (long) mid * mid;
            if (square > num) {
                max = mid - 1;
            } else if (square < num) {
                min = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
