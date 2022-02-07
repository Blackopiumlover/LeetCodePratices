public class LeetCode1646GetMaximumGenerated {
    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(3));
    }

    public static int getMaximumGenerated(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] numbers = new int[n + 1];
        numbers[0] = 0;
        numbers[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                numbers[i] = numbers[i / 2];
            } else {
                numbers[i] = numbers[(i + 1) / 2] + numbers[i / 2];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
