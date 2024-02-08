fun main(args: Array<String>) {

}

class Solution {
    private var x: Int = 0
    private var xParent: TreeNode? = null
    private var xk = 0
    private var xFound = false
    private var y: Int = 0
    private var yParent: TreeNode? = null
    private var yk = 0
    private var yFound = false

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        this.x = x
        this.y = y
        dfs(root, 0, null)
        return xk == yk && xParent != yParent
    }

    private fun dfs(node: TreeNode?, depth: Int, parentNode: TreeNode?) {
        if (node == null) {
            return
        } else {
            if (node.`val` == x) {
                xParent = parentNode
                xk = depth
                xFound = true
            } else if (node.`val` == y) {
                yParent = parentNode
                yk = depth
                yFound = true
            }
        }

        dfs(node.left, depth + 1, node)

        if (xFound && yFound) {
            return
        } else {
            dfs(node.right, depth + 1, node)
        }
    }
}