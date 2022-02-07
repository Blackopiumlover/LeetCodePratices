import java.util.HashMap;
import java.util.Map;

public class LeetCode1394FindLucky {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[] {2,2,3,4}));
        System.out.println(findLucky(new int[] {1,2,2,3,3,3}));
        System.out.println(findLucky(new int[] {2,2,2,3,3}));
        System.out.println(findLucky(new int[] {5}));
        System.out.println(findLucky(new int[] {7,7,7,7,7,7,7}));
    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.replace(i, map.get(i), map.get(i) + 1);
            }
        }
        int lucky = -1;
        for (int i : arr) {
            if (i == map.get(i) && i > lucky) {
                lucky = i;
            }
        }
        return lucky;
    }
}
