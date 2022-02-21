import java.util.HashMap;
import java.util.Map;

public class LeetCode1779NearestValidPoint {
    public static void main(String[] args) {
        System.out.println(nearestValidPoint(2, 2, new int[][] {
                new int[] {5, 4},
                new int[] {3, 4},
                new int[] {1, 3},
                new int[] {3, 2},
                new int[] {1, 7},
                new int[] {4, 2}
        }));
    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        Map<int[], Integer> validPoints = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                validPoints.put(points[i], i);
            }
        }
        System.out.println(validPoints);
        int minDistance = Integer.MAX_VALUE;
        int index = -1;
        for (int[] point : validPoints.keySet()) {
            int distance = Math.abs(x - point[0]) + Math.abs(y - point[1]);
            if (distance == minDistance) {
                index = Math.min(index, validPoints.get(point));
            }
            if (distance < minDistance) {
                index = validPoints.get(point);
                minDistance = distance;
            }
        }
        return index;
    }
}
