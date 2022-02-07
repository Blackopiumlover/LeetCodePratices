public class LeetCode69MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int max = x;
        int min = 0;
        while(max - min > 1) {
            int mid = (max + min) / 2;
            // Use x / mid instead of mid * mid to avoid overflow.
            // Just like when mid * mid > 2 ^ 31 - 1, it will overflow.
            // Because it will calculate mid * mid at first then compare with x.
            if (x / mid < mid) {
                max = mid;
            } else {
                min = mid;
            }
        }
        return min;
    }
}
