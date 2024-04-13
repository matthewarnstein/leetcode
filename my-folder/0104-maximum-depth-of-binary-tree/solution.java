/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int depth = getDepth(root, 0);

        return depth;
    }

    public int getDepth(TreeNode root, int d) {
        if (root == null)
            return d;
        return Math.max(getDepth(root.left, d + 1), getDepth(root.right, d + 1));
    }
}
