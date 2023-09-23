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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right) <= 1)
            return subTreeIsBalanced(root.left) && subTreeIsBalanced(root.right);
        else
            return false;

    }


    public boolean subTreeIsBalanced(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right) <= 1)
            return subTreeIsBalanced(root.left) && subTreeIsBalanced(root.right);
        else
            return false;
    }


    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        } else if(root.left == null && root.right == null) {
            return 1;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }
}
