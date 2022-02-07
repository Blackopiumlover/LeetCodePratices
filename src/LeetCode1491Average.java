public class LeetCode1491Average {
    public static void main(String[] args) {
        System.out.println(average(new int[] {4000, 3000, 1000, 2000}));
        System.out.println(average(new int[] {1000, 2000, 3000}));
    }

    public static double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i : salary) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        sum -= max;
        sum -= min;
        return (double) sum / (salary.length - 2);
    }
}
