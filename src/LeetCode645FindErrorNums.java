public class LeetCode645FindErrorNums {
    public static void main(String[] args) {
        int[] arr = findErrorNums(new int[]{1,1});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int[] cnt = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 2) {
                ans[0] = i;
            }
            if (cnt[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}
