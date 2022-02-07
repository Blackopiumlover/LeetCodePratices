public class LeetCode237DeleteNode {
    public static void main(String[] args) {
        ListNode first = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(9);
        first.next = second;
        second.next = third;
        third.next = fourth;
        deleteNode(second);
        ListNode node = first;
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static void deleteNode(ListNode node) {
        ListNode currNode = node;
        ListNode preNode = node;
        while(currNode.next != null) {
            currNode.val = currNode.next.val;
            preNode = currNode;
            currNode = currNode.next;
        }
        preNode.next = null;
    }
}
