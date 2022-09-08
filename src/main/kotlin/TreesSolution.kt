class TreesSolution {

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/

        Maximum Depth of Binary Tree
     */

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        var maxDepth = 1

        var activeLeafs = mutableListOf<TreeNode?>(root)

        while (activeLeafs.isNotEmpty()) {
            var newLeafs = mutableListOf<TreeNode?>()
            activeLeafs.forEach {
                newLeafs.add(it?.left)
                newLeafs.add(it?.right)
            }
            newLeafs = newLeafs.filterNotNull().toMutableList()
            if (newLeafs.isNotEmpty()) {
                maxDepth++
            }
            activeLeafs = newLeafs
        }
        return maxDepth
    }

    fun maxDepthV2(root: TreeNode?): Int {
        return if (root == null) 0 else maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
    }
}

/*
    Definition for a binary tree node.
 */
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}