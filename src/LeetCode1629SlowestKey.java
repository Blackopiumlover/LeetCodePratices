public class LeetCode1629SlowestKey {
    public static void main(String[] args) {
        int[] releaseTimes = new int[] {9, 29, 49, 50};
        String keysPressed = "cbcd";
        System.out.println(slowestKey(releaseTimes, keysPressed));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        if (releaseTimes.length != keysPressed.length() || releaseTimes == null || releaseTimes.length == 0 || keysPressed.length() == 0) {
            return 0;
        }
        char slowest = keysPressed.charAt(0);
        int longestRemainTime = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            if (releaseTimes[i] - releaseTimes[i - 1] > longestRemainTime) {
                slowest = keysPressed.charAt(i);
                longestRemainTime = releaseTimes[i] - releaseTimes[i - 1];
            } else if (releaseTimes[i] - releaseTimes[i - 1] == longestRemainTime) {
                if (keysPressed.charAt(i) > slowest) {
                    slowest = keysPressed.charAt(i);
                }
            }
        }
        return slowest;
    }
}
