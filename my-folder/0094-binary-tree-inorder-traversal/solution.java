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
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorder(root);
        
    }


    public List<Integer> inorder(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        if(root != null) {
            //list.add(root.val);
            list.addAll(inorder(root.left));
            //System.out.print(root.val + ", ");
            list.add(root.val);
            //inorder(root.right);
            //list.addAll(inorder(root.left));
            //list.addAll(inorder(root.right));
            list.addAll(inorder(root.right));
        }

        return list;
    }


}
