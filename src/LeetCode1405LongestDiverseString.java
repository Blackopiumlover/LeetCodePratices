import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode1405LongestDiverseString {

    public static void main(String[] args) {
        System.out.println(longestDiverseString(1, 1, 7));
        System.out.println(longestDiverseString(2, 2, 1));
        System.out.println(longestDiverseString(7, 1, 0));
    }

    // 贪心算法，优先拼剩余最多的字母
    public static String longestDiverseString(int a, int b, int c) {
        // 让剩余个数最多的字母处于队列头
        Queue<LetterCount> queue = new PriorityQueue<>((o1, o2) -> o2.count - o1.count);
        if (a > 0) {
            queue.add(new LetterCount(a, 'a'));
        }
        if (b > 0) {
            queue.add(new LetterCount(b, 'b'));
        }
        if (c > 0) {
            queue.add(new LetterCount(c, 'c'));
        }
        StringBuilder sb = new StringBuilder();
        // 前一个字母
        char preChar = ' ';
        // 前一个字母已经有几个了
        int preCharCount = 0;
        while(queue.size() > 0) {
            // 拿出当前队列中剩余最多的字母
            LetterCount lc = queue.poll();
            // 如果和前一个字母不一样，直接接上
            if (lc.letter != preChar) {
                sb.append(lc.letter);
                // 更新前面字母的状态和计数
                preChar = lc.letter;
                preCharCount = 1;
                // 如果该字母还有，放回去
                if (lc.count > 1) {
                    queue.add(new LetterCount(lc.count - 1, lc.letter));
                }
                // 拿出的当前剩余最多的字母和前面字母一样，并且没有拼接超过2个，还可以接着拼接
            } else if (preCharCount < 2) {
                sb.append(lc.letter);
                // 更新前面字母的计数
                preCharCount = 2;
                // 如果该字母还有，放回去
                if (lc.count > 1) {
                    queue.add(new LetterCount(lc.count - 1, lc.letter));
                }
                // 拿出的当前剩余最多的字母和前面字母一样，但已经拼接了两个该字母了
            } else {
                if (queue.size() == 0) {
                    break;
                } else {
                    // 此时看看剩余个数第二多的字母
                    LetterCount secondLc = queue.poll();
                    sb.append(secondLc.letter);
                    // 更新前面字母的状态和计数
                    preChar = secondLc.letter;
                    preCharCount = 1;
                    // 如果该字母还有，放回去
                    if (secondLc.count > 1) {
                        queue.add(new LetterCount(secondLc.count - 1, secondLc.letter));
                    }
                    // 别忘了将最开始拿出来的剩余个数最多的字母放回队列
                    queue.add(lc);
                }
            }
        }
        return sb.toString();
    }

    static class LetterCount {
        int count;
        char letter;
        LetterCount(int count, char letter) {
            this.count = count;
            this.letter = letter;
        }
    }
}
