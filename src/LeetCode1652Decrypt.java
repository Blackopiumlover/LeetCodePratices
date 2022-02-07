public class LeetCode1652Decrypt {
    public static void main(String[] args) {
        int[] code = new int[] {2, 4, 9, 3};
        int[] result = decrypt(code, -2);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] decrypt(int[] code, int k) {
        if (code == null || code.length == 0) {
            return null;
        }
        if (k > 0) {
            int[] result = new int[code.length];
            for (int i = 0; i < code.length; i++) {
                for (int j = 1; j < k + 1; j++) {
                    result[i] += code[(i + j) % code.length];
                }
            }
            return result;
        } else if (k < 0) {
            k = -k;
            int[] result = new int[code.length];
            for (int i = 0; i < code.length; i++) {
                for (int j = 1; j < k + 1; j++) {
                    result[i] += code[(i - j + code.length) % code.length];
                }
            }
            return result;
        } else {
            return new int[code.length];
        }
    }
}
