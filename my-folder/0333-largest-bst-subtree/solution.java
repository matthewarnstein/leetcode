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
    public int largestBSTSubtree(TreeNode root) {
        if (root == null)
            return 0;
        List<Integer> vals = new ArrayList<Integer>();
        List<TreeNode> roots = new ArrayList<TreeNode>();
        toArray(root, vals);
        inorder(root, roots);
        System.out.println(Arrays.toString(vals.toArray()));
        //System.out.println(Arrays.toString(roots.toArray()));
        System.out.println(isBST(vals));
        return printRoots(roots);

        //return 1;
    }

    public int printRoots(List<TreeNode> roots) {
        List<Integer> vals = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for (TreeNode root : roots) {
            vals = new ArrayList<Integer>();
            toArray(root, vals);
            if (isBST(vals)) {
                if (vals.size() > max)
                    max = vals.size();
            }
            System.out.println("max: " + max);
        }
        return max;

    }

    public void inorder(TreeNode root, List<TreeNode> roots) {
        if (root == null)
            return;
        if (isLeaf(root)) {
            roots.add(root);
            return;
        }
        inorder(root.left, roots);
        roots.add(root);
        inorder(root.right, roots);
        return;
    }



    public boolean isBST(List<Integer> vals) {
        if (vals.isEmpty())
            return false;
        int prev = vals.get(0);
        for (int i = 1; i < vals.size(); i++) {
            if (prev >= vals.get(i)) {
                return false;
            }
            prev = vals.get(i);
        }
        return true;
    }


    public void toArray(TreeNode root, List<Integer> vals) {
        if (root == null)
            return;
        if (isLeaf(root)) {
            vals.add(root.val);
            return;
        }
        toArray(root.left, vals);
        vals.add(root.val);
        toArray(root.right, vals);
        return;
    }

    public boolean isLeaf(TreeNode root) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return true;
        return false;
    }


}
