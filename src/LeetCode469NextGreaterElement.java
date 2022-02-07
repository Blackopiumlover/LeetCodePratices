import java.util.HashMap;
import java.util.Map;

public class LeetCode469NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = new int[] {2, 4};
        int[] nums2 = new int[] {1, 2, 3, 4};
        int[] result = nextGreaterElement(nums1, nums2);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int startIndex = map.get(nums1[i]);
            if (startIndex == -1) {
                ans[i] = -1;
                continue;
            }
            boolean flag = false;
            for (int j = startIndex; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
