/**
 * Judging if the number is power of 2, there are two approaches to the answer:
 *      1. If the number is power of 2, then the half of this number is also power of 2.
 *      2. The binary code of that number n should only have one "1", that means n & (n - 1) == 0
 */
public class LeetCode231IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(5));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0 || n % 2 != 0) {
            return n == 1;
        }
        return (n & (n - 1)) == 0;
    }
}
