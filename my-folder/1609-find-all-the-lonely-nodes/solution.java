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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> lonelyNodes = new ArrayList<Integer>();
        if (root == null)
            return lonelyNodes;

        lonelyNodes.addAll(getLonelyNodes(root, root.left));
        lonelyNodes.addAll(getLonelyNodes(root, root.right));
        return lonelyNodes;
    }

    public List<Integer> getLonelyNodes(TreeNode p, TreeNode c) {
        ArrayList<Integer> lonelyNodes = new ArrayList<Integer>();
        if (c == null)
            return lonelyNodes;
        if (isLonelyNode(p, c))
            lonelyNodes.add(c.val);
        lonelyNodes.addAll(getLonelyNodes(c, c.left));
        lonelyNodes.addAll(getLonelyNodes(c, c.right));
        return lonelyNodes;
    }

    public boolean isLonelyNode(TreeNode p, TreeNode c) {
        if ( (p.left == null ^ p.right == null )
            && (c != null)
        )
            return true;
        else
            return false;

    }



}
