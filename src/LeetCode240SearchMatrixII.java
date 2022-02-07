public class LeetCode240SearchMatrixII {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                new int[] {1, 4, 7, 11, 15},
                new int[] {2, 5, 8, 12, 19},
                new int[] {3, 6, 9, 16, 22},
                new int[] {10, 13, 14, 17, 24},
                new int[] {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(matrix, 5));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int len = 0;
        int width = matrix[0].length - 1;
        while (len < matrix.length && width >= 0) {
            if (matrix[len][width] > target) {
                width -= 1;
            } else if (matrix[len][width] < target) {
                len += 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
