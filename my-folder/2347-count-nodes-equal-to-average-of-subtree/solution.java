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
    public int averageOfSubtree(TreeNode root) {
        if (root == null)
            return 0; 
        return equalsAverage(root);
        
    }

    public int equalsAverage(TreeNode root) {
        if (root == null)
            return 0;
        List<Integer> vals = sumOfSubtree(root);
        int size = vals.size();
        if (size == 0)
            size = 1;
        int sum = 0;
        int isAverage = 0;
        for(Object val : vals.toArray())
            sum += ((int)val);
        int ave = sum / size;
        if (ave == root.val)
            isAverage = 1;
        return isAverage + equalsAverage(root.left) + equalsAverage(root.right);
    }

    public List<Integer> sumOfSubtree(TreeNode root) {
        List<Integer> vals = new ArrayList<Integer>();
        if (root == null)
            return vals;
        vals.add(root.val);
        vals.addAll(sumOfSubtree(root.left));
        vals.addAll(sumOfSubtree(root.right));
        return vals;

    }
}
