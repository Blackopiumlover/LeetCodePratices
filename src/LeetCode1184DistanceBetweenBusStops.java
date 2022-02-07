public class LeetCode1184DistanceBetweenBusStops {
    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[] {1,2,3,4}, 0, 3));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        if (start == destination) {
            return 0;
        }
        int sum = 0;
        int clockWise = 0;
        for (int i = 0; i < distance.length; i++) {
            sum += distance[i];
            if (i >= start && i < destination) {
                clockWise += distance[i];
            }
        }
        int counterClockWise = sum - clockWise;
        return Math.min(clockWise, counterClockWise);
    }
}
