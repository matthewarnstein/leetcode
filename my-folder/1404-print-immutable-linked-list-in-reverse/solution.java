/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        printNextNode(head);
    }

    public ImmutableListNode printNextNode(ImmutableListNode head) {
        if (head == null)
            return null;
        else {
            printNextNode(head.getNext());
            head.printValue();
        }
        return null;
    }
}
