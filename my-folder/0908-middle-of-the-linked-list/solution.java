/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getSize(ListNode node) {
        if (node.next == null) {
            return 1;
        } else {
            return 1 + getSize(node.next);
        }
    }

    public ListNode getMiddleNode(ListNode head, int mid) {
        ListNode current = head;
        int count = 0;
        while(count < mid && current.next != null) {
            current = current.next;
            count++;
        }
        return current;
    }

    public ListNode middleNode(ListNode head) {
        int size = getSize(head);
        int mid = size/2;
        System.out.println("size: " + size);
        System.out.println("mid: " + mid);
        return getMiddleNode(head, mid);
    }
}
