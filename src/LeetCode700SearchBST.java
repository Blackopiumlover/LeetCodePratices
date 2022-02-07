public class LeetCode700SearchBST {
    public static void main(String[] args) {

    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        } else if (root.val > val) {
            root = root.left;
        } else {
            root = root.right;
        }
        return searchBST(root, val);
    }
}
