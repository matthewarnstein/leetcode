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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p, q);
    }

    public boolean inorder(TreeNode p, TreeNode q) {
        boolean isSame = true;

        if (p != null && q != null) {
            isSame = (inorder(p.left, q.left) && (p.val == q.val) && inorder(p.right, q.right));
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            isSame = false;
        }
        return isSame;

    }
}
