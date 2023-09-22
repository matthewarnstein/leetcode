import java.lang.*;
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
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> left = preorder(root.left);
        ArrayList<Integer> right = revorder(root.right);

        System.out.println(Arrays.toString(left.toArray()));
        System.out.println(Arrays.toString(right.toArray()));
        return left.equals(right);
    }

    public ArrayList<Integer> preorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) {
            list.add(-101);
        } else {
            list.add(root.val);
            list.addAll(preorder(root.left));
            list.addAll(preorder(root.right));
        }
        return list;
    }

    public ArrayList<Integer> revorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(root == null) {
            list.add(-101);
        } else {
            list.add(root.val);
            list.addAll(revorder(root.right));
            list.addAll(revorder(root.left));
        }
        return list;
    }
}
