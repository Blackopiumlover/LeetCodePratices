import java.util.HashMap;
import java.util.Map;

public class LeetCode2006CountKDifference {
    public static void main(String[] args) {
        System.out.println(countKDifference2(new int[] {1,2,2,1}, 1));
        System.out.println(countKDifference2(new int[] {1,3}, 3));
        System.out.println(countKDifference2(new int[] {3,2,1,5,4}, 2));
    }

    // 暴力
    public static int countKDifference1(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count += 1;
                }
            }
        }
        return count;
    }

    // HashMap
    public static int countKDifference2(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i - k)) {
                count += map.get(i - k);
            }
            if (map.containsKey(i + k)) {
                count += map.get(i + k);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return count;
    }
}
