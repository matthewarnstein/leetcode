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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = mergeRoots(root1, root2);
        return root;
    }

    public TreeNode mergeRoots(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();

        if (root1 == null && root2 == null)
            return null;
        if (root1 != null && root2 != null) {
            root.val = root1.val + root2.val;
            root.left = mergeRoots(root1.left, root2.left);
            root.right = mergeRoots(root1.right, root2.right);
        }
        if (root1 != null && root2 == null) {
            root = root1;
        }
        if (root1 == null && root2 != null) {
            root = root2;
        }
        return root;


    }
}
