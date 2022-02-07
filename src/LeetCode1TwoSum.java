import java.util.HashMap;
import java.util.Map;

public class LeetCode1TwoSum {
    public static void main(String[] args) {
        int[] ans = twoSum(new int[]{3,3}, 6);
        if (ans != null) {
            System.out.println(ans[0]);
            System.out.println(ans[1]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
