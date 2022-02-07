public class LeetCode66PlusOne {
    public static void main(String[] args) {
        int[] ans = plusOne(new int[] {9,8,7,6,5,4,3,2,1,0});
        for (int i : ans) {
            System.out.print(i);
        }
    }
    public static int[] plusOne(int[] digits) {
        int one = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                int sum = digits[i] + 1;
                if (sum == 10) {
                    digits[i] = 0;
                    one = 1;
                } else {
                    digits[i] = sum;
                    one = 0;
                }
            } else {
                int sum = digits[i] + one;
                if (sum == 10) {
                    digits[i] = 0;
                    one = 1;
                } else {
                    digits[i] = sum;
                    one = 0;
                }
            }
        }
        if (digits[0] == 0 && one == 1) {
            int[] extraDigits = new int[digits.length + 1];
            extraDigits[0] = 1;
            for(int i = 1; i < extraDigits.length; i++) {
                extraDigits[i] = digits[i - 1];
            }
            return extraDigits;
        }
        return digits;
    }
}
