import java.util.Arrays;

public class LeetCode1051HeightChecker {
    public static void main(String[] args) {

    }
    public static int heightChecker(int[] heights) {
        int[] originHeights = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (originHeights[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
