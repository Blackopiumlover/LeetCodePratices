import java.util.Arrays;

public class LeetCode1619TrimMean {
    public static void main(String[] args) {
        System.out.println(trimMean(new int[] {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3}));
    }
    public static double trimMean(int[] arr) {
        int bounds = arr.length / 20;
        Arrays.sort(arr);
        double sum = 0;
        for (int i = bounds; i < arr.length - bounds; i++) {
            sum += arr[i];
        }
        return sum / (arr.length - 2 * bounds);
    }
}
