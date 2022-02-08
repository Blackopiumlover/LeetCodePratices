import java.util.*;

/**
 * @author Yongjia
 * @create 2022-02-08-16:30
 */
public class LeetCode1636FrequencySort {
    public static void main(String[] args) {
        int[] a = frequencySort(new int[]{1,1,2,2,2,3});
        for(int i : a) {
            System.out.print(i + " ");
        }
    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            list.add(i);
        }
        list.sort((o1, o2) -> {
            int o1Count = map.get(o1);
            int o2Count = map.get(o2);
            if (o1Count == o2Count) {
                return o2 - o1;
            }
            return o1Count - o2Count;
        });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
