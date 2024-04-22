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
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> vals = new ArrayList<Integer>();
        postorder(root, vals);
        //System.out.println(Arrays.toString(vals.toArray()));
        return root;
    }

    public void postorder(TreeNode root, List<Integer> vals) {
        if (root == null) return;
        postorder(root.right, vals);
        int gst = 0;
        if (vals.isEmpty()) {
            gst = root.val;
        } else {            
            gst = vals.get(vals.size() - 1) + root.val;
        }
        //root.val = gst;
        vals.add(gst);
        postorder(root.left, vals);
        root.val = gst;
        return;
    }
}
