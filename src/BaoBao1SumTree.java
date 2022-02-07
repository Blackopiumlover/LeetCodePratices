import java.util.Stack;

public class BaoBao1SumTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode l11 = new TreeNode(3);
        TreeNode l12 = new TreeNode(3);
        TreeNode l21 = new TreeNode(6);
        TreeNode l22 = new TreeNode(1);
        TreeNode l24 = new TreeNode(7);
        root.left = l11;
        root.right = l12;
        l11.left = l21;
        l11.right = l22;
        l12.right = l24;
        /**
         *                  2
         *                 / \
         *                3   3
         *               / \   \
         *              6   1   7
         */
        System.out.println(sumTree1(root));
        System.out.println(sumTree2(root));
    }

    public static int sumTree1(TreeNode root) {
        // digui
        if (root == null) {
            return 0;
        }
        return sumTree1(root.left) + sumTree1(root.right) + root.val;
   }

   public static int sumTree2(TreeNode root) {
        // diedai
       if (root == null) {
           return 0;
       }
       Stack<TreeNode> stack = new Stack<>();
       int sum = 0;
       stack.push(root);
       while(!stack.isEmpty()) {
           TreeNode node = stack.pop();
           sum += node.val;
           if (node.right != null) {
               stack.push(node.right);
           }
           if (node.left != null) {
               stack.push(node.left);
           }
       }
       return sum;
   }
}
