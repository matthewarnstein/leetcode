/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> vals = new ArrayList<Integer>();
        traverse(root, vals);
        return vals;
    }

    public void traverse(Node node, List<Integer> vals) {
        if (node == null) return;
        if (isLeaf(node))
            vals.add(node.val);
        else {
            for (Node child : node.children) {
                traverse(child, vals);
            }
            vals.add(node.val);
        }
        return;
    }

    public boolean isLeaf(Node node) {
        if (node == null)
            return false;
        if (node.children.isEmpty())
            return true;

        return false;
    }
}
