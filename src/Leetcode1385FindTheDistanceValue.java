public class Leetcode1385FindTheDistanceValue {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean flag;
        for (int i = 0; i < arr1.length; i++) {
            flag = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count += 1;
            }
        }
        return count;
    }
}
