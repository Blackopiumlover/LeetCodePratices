import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225MyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }

    private static class MyStack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue1.add(x);
        }

        public int pop() {
            while(queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            int top = queue1.poll();
            while(!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
            return top;
        }

        public int top() {
            while(queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            int top = queue1.poll();
            queue2.add(top);
            while(!queue2.isEmpty()) {
                queue1.add(queue2.poll());
            }
            return top;
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}
