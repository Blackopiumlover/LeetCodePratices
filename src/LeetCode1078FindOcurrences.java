import java.util.LinkedList;
import java.util.List;

public class LeetCode1078FindOcurrences {
    public static void main(String[] args) {
        String[] ans = findOcurrences("alice is a good girl she is a good student", "a", "good");
        for (String s : ans) {
            System.out.println(s);
        }
    }
    public static String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new LinkedList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second) && i + 2 <= words.length - 1) {
                ans.add(words[i + 2]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
