/**
 * @author Yongjia
 * @create 2022-06-06-15:42
 */
public class LeetCode733FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][] {
                new int[] {1, 1, 1},
                new int[] {1, 1, 0},
                new int[] {1, 0, 1}
        };

        int[][] newImage = floodFill(image, 1, 1, 2);
        for (int[] i : newImage) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return dfs(image, sr, sc, newColor, image[sr][sc]);
    }
    public static int[][] dfs(int[][] image, int sr, int sc, int newColor, int currentColor) {
        if (sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length && image[sr][sc] == currentColor && image[sr][sc] != newColor) {
            currentColor = image[sr][sc];
            image[sr][sc] = newColor;
            dfs(image, sr - 1, sc, newColor, currentColor);
            dfs(image, sr + 1, sc, newColor, currentColor);
            dfs(image, sr, sc - 1, newColor, currentColor);
            dfs(image, sr, sc + 1, newColor, currentColor);
        }
        return image;
    }
}
