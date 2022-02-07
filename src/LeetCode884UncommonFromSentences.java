import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Yongjia
 * @create 2022-02-07-20:59
 */
public class LeetCode884UncommonFromSentences {
    public static void main(String[] args) {
        String[] s1 = uncommonFromSentences("this apple is sweet", "this apple is sour");
        System.out.println(s1[0] + " " + s1[1]);
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        List<String> list = new LinkedList<>();
        for (String s : words1) {
            if (map1.get(s) == 1 && map2.get(s) == null) {
                list.add(s);
            }
        }
        for (String s : words2) {
            if (map2.get(s) == 1 && map1.get(s) == null) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}
