public class LeetCode1103DistributeCandiesII {
    public static void main(String[] args) {
        int[] ans = distributeCandies(7, 4);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] numbers = new int[num_people];
        int shouldPut = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (candies < shouldPut) {
                numbers[i] += candies;
                return numbers;
            }
            numbers[i] += shouldPut;
            candies -= shouldPut;
            shouldPut += 1;
            if (i == numbers.length - 1 && candies > 0) {
                i = -1;
            }
        }
        return numbers;
    }
}
