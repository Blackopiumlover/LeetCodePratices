import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode506FindRelativeRanks {
    public static void main(String[] args) {
        String[] ans = findRelativeRanks(new int[] {10, 3, 8, 9, 4});
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static String[] findRelativeRanks(int[] score) {
        int[] copy = Arrays.copyOf(score, score.length);
        Arrays.sort(copy);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < copy.length; i++) {
            map.put(copy[i], copy.length - i);
        }
        String[] ranks = new String[score.length];
        for (int i = 0; i < ranks.length; i++) {
            if (map.get(score[i]) == 1) {
                ranks[i] = "Gold Medal";
            } else if (map.get(score[i]) == 2) {
                ranks[i] = "Silver Medal";
            } else if (map.get(score[i]) == 3) {
                ranks[i] = "Bronze Medal";
            } else {
                ranks[i] = map.get(score[i]) + "";
            }
        }
        return ranks;
    }
}
