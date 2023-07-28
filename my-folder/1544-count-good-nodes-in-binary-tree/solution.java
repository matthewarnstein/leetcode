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
    public int goodNodes(TreeNode root) {
        int count = numGoodNodes(root, Integer.MIN_VALUE);
        return count;
    }

    public int numGoodNodes(TreeNode root, int max) {
        if(root == null)
            return 0;
        else if(root.val >= max) {
            return 1 + numGoodNodes(root.left,root.val) + numGoodNodes(root.right,root.val);
        } else
            return numGoodNodes(root.left,max) + numGoodNodes(root.right,max);

    }
}
