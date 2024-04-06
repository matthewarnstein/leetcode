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
    public boolean checkTree(TreeNode root) {
        if (root.val == childSum(root.left) + childSum(root.right))
            return true;
        else
            return false;
    }

    public int childSum(TreeNode root) {
        if (root == null)
            return 0;
        int sum = root.val + childSum(root.left) + childSum(root.right);

        return sum;
    }
}
