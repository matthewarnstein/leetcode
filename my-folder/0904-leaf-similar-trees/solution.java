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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> lvs1 = leafValueSequence(root1);
        ArrayList<Integer> lvs2 = leafValueSequence(root2);

        return lvs1.equals(lvs2);
    }

    public ArrayList<Integer> leafValueSequence(TreeNode root) {
        if(root == null) {
            ArrayList<Integer> empty = new ArrayList<Integer>();
            return empty;
        } else if(root.left == null && root.right == null) {
            ArrayList<Integer> leaf = new ArrayList<Integer>();
            leaf.add(root.val);
            return leaf;
        } else {
            ArrayList<Integer> leaves = new ArrayList<Integer>();
            leaves.addAll(leafValueSequence(root.left));
            leaves.addAll(leafValueSequence(root.right));
            return leaves;
        }

    }
}
