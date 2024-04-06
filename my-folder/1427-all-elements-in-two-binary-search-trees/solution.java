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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> combined = new ArrayList<Integer>();
        combined.addAll(traverseTree(root1));
        combined.addAll(traverseTree(root2));
        Integer[] arr = combined.toArray(new Integer[0]);
        Arrays.sort(arr);
        
        return Arrays.asList(arr);
    }


    public List<Integer> traverseTree(TreeNode root) {
        List<Integer> elements = new ArrayList<Integer>();
        if (root == null)
            return elements;
        elements.add(root.val);
        elements.addAll(traverseTree(root.left));
        elements.addAll(traverseTree(root.right));
        return elements;
    }
}
