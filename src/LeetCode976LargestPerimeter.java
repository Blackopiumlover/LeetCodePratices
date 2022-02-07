import java.util.Arrays;

public class LeetCode976LargestPerimeter {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{2,1,2}));
        System.out.println(largestPerimeter(new int[]{1,2,1}));
        System.out.println(largestPerimeter(new int[]{3,2,3,4}));
        System.out.println(largestPerimeter(new int[]{3,6,2,3}));
    }

    public static int largestPerimeter(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if (b + c > a) {
                return a + b + c;
            }
        }
        return 0;
    }
}
