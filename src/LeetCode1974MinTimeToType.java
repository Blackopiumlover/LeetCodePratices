public class LeetCode1974MinTimeToType {
    public static void main(String[] args) {
        System.out.println(minTimeToType("zjpc"));
    }

    public static int minTimeToType(String word) {
        int times = 0;
        char curr = 'a';
        for (int i = 0; i < word.length(); i++) {
            int moves = Math.abs(word.charAt(i) - curr);
            moves = Math.min(moves, 26 - moves);
            moves += 1;
            times += moves;
            curr = word.charAt(i);
        }
        return times;
    }
}
