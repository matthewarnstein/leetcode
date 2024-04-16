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
    public List<Integer> preorderTraversal(TreeNode root) {
        return traverse(root);
    }

    public List<Integer> traverse(TreeNode root) {
        List<Integer> preorder = new ArrayList<Integer>();
        if (root == null)
            return preorder;
        preorder.add(root.val);
        preorder.addAll(traverse(root.left));
        preorder.addAll(traverse(root.right));
        return preorder;
    }
}
