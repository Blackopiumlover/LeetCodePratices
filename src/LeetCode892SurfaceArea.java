public class LeetCode892SurfaceArea {
    public static void main(String[] args) {

    }

    public static int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int numbers = grid[i][j];
                area += 6 * numbers;
                if (numbers > 1) {
                    area -= (numbers - 1) * 2;
                }
                if (i >= 1) {
                    area -= Math.min(numbers, grid[i - 1][j]) * 2;
                }
                if (j >= 1) {
                    area -= Math.min(numbers, grid[i][j - 1]) * 2;
                }
            }
        }
        return area;
    }
}
