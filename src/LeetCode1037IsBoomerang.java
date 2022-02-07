public class LeetCode1037IsBoomerang {
    public static void main(String[] args) {

    }

    public static boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];

        int px1 = x2 - x1;
        int px2 = x3 - x2;
        int py1 = y2 - y1;
        int py2 = y3 - y2;
        // Use multiple instead of divine to avoid the divisor is 0.
        return px1 * py2 != px2 * py1;
    }
}
