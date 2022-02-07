import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LeetCode1441BuildArray {
    public static void main(String[] args) {
        List<String> list = buildArray(new int[] {2,3,4}, 4);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> buildArray(int[] target, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i : target) {
            set.add(i);
        }
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= target[target.length - 1]; i++) {
            if (set.add(i)) {
                list.add("Push");
                list.add("Pop");
            } else {
                list.add("Push");
            }
        }
        return list;
    }
}
