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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeaf(root, false);
    }

    public int sumLeaf(TreeNode root, boolean isLeftChild) {
        if (root == null)
            return 0;
        if (isLeaf(root)) {
            if (isLeftChild) {
                return root.val;
            } else
                return 0;
        } else
            return sumLeaf(root.left,true) + sumLeaf(root.right,false);
    }

    public boolean isLeaf(TreeNode node) {
        if (node != null && node.left == null && node.right == null)
            return true;
        else
            return false;
    }
}
