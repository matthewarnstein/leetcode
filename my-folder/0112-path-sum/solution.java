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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        
        boolean leftBranch = root.left != null;
        boolean rightBranch = root.right != null;

        if (!leftBranch && !rightBranch && root.val == targetSum)
            return true;
        
        return (leftBranch && sumPath(root.left, root.val, targetSum) )
             || (rightBranch && sumPath(root.right, root.val, targetSum) );
    }

    public boolean sumPath(TreeNode root, int sum, int targetSum) {
        if (root == null)
            return false;

        int newSum = sum + root.val;
        if (isLeaf(root))
            if (newSum == targetSum)
                return true;
            else
                return false;

        if ( sumPath(root.left, newSum, targetSum) 
            || sumPath(root.right, newSum, targetSum) )
            return true;
        else
            return false;
    }

    public boolean isLeaf(TreeNode root) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return true;

        return false;
    }
}
