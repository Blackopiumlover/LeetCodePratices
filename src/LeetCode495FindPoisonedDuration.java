public class LeetCode495FindPoisonedDuration {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[] {1, 2}, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] - timeSeries[i] >= duration) {
                time += duration;
            } else {
                time += timeSeries[i + 1] - timeSeries[i];
            }
        }
        time += duration;
        return time;
    }
}
