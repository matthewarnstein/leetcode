/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return BFS(cloned, target);
    }

    public TreeNode BFS(TreeNode root, TreeNode target) {
        if (root == null)
            return null;
        if (root.val == target.val)
            return root;
        else {
            TreeNode left = BFS(root.left, target);
            TreeNode right = BFS(root.right, target);
            if (left != null)
                return left;
            if (right != null)
                return right;
        }
        return null;
    }
}
