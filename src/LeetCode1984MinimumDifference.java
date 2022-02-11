import java.util.Arrays;

/**
 * @author Yongjia
 * @create 2022-02-11-13:37
 */
public class LeetCode1984MinimumDifference {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[] {90}, 1));
        System.out.println(minimumDifference(new int[] {9,4,1,7}, 2));
    }
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < nums.length; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
}
