import java.util.LinkedList;
import java.util.List;

public class LeetCode1260ShiftGrid {
    public static void main(String[] args) {
        int[][] array = new int[][] {new int[] {1,2,3}, new int[] {4,5,6}, new int[] {7,8,9}};
        System.out.println(shiftGird(array, 10));
    }
    public static List<List<Integer>> shiftGird(int[][] grid, int k) {
        List<Integer> sum = new LinkedList<>();
        for (int[] i : grid) {
            for (int j : i) {
                sum.add(j);
            }
        }
        List<Integer> shift = new LinkedList<>();
        int start = k % sum.size();
        for (int i = sum.size() - start; i < sum.size(); i++) {
            shift.add(sum.get(i));
        }
        for (int i = 0; i < sum.size() - start; i++) {
            shift.add(sum.get(i));
        }
        List<List<Integer>> columns = new LinkedList<>();
        int index = 0;
        while (index < shift.size()) {
            List<Integer> rows = new LinkedList<>();
            for (int i = 0; i < grid[0].length; i++) {
                rows.add(shift.get(index + i));
            }
            index += rows.size();
            columns.add(rows);
        }
        return columns;
    }
}
