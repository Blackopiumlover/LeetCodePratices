import java.util.LinkedList;
import java.util.List;

public class LeetCode498FindDiagonalOrder {
    public static void main(String[] args) {
        int[] result = findDiagonalOrder(new int[][] {
                new int[] {1},
                new int[] {4},
                new int[] {7}
        });
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        int cols = mat[0].length;
        int rows = mat.length;
        int x = 0;
        int y = 0;
        List<Entry> list = new LinkedList<>();
        for (int i = 0; i < rows * cols; i++) {
            list.add(new Entry(x, y));
            if ((x + y) % 2 == 0) {
                if (x == cols - 1) {
                    y += 1;
                } else if (y == 0) {
                    x += 1;
                } else {
                    x += 1;
                    y -= 1;
                }
            } else {
                if (y == rows - 1) {
                    x += 1;
                } else if (x == 0) {
                    y += 1;
                } else {
                    x -= 1;
                    y += 1;
                }
            }
        }
        int[] result = new int[rows * cols];
        for (int i = 0; i < result.length; i++) {
            result[i] = mat[list.get(i).y][list.get(i).x];
        }
        return result;
    }
}
class Entry {
    int x;
    int y;
    Entry(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
