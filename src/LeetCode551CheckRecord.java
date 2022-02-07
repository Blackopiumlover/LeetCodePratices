public class LeetCode551CheckRecord {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }

    public static boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int continueLate = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                absent += 1;
                late = 0;
            } else if (s.charAt(i) == 'L') {
                late += 1;
                continueLate = Math.max(continueLate, late);
            } else {
                late = 0;
            }
        }
        System.out.println(absent);
        System.out.println(continueLate);
        return absent < 2 && continueLate < 3;
    }
}
