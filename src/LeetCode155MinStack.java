import java.util.LinkedList;
import java.util.List;

public class LeetCode155MinStack {

    public static void main(String[] args) {
        LeetCode155MinStack stack = new LeetCode155MinStack();
        stack.push(2);
        stack.push(0);
        stack.push(3);
        stack.push(0);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }

    private List<Integer> minStack;
    private List<Integer> stack;

    public LeetCode155MinStack () {
        minStack = new LinkedList<>();
        stack = new LinkedList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty()) {
            minStack.add(val);
        } else {
            if (minStack.get(minStack.size() - 1) >= val) {
                minStack.add(val);
            } else {
                minStack.add(minStack.get(minStack.size() - 1));
            }
        }
    }

    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
