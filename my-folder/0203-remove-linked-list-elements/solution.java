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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        
        ListNode trav = head;
        ListNode prev = null;
        while (trav != null) {
            if (trav.val == val) {
                if (prev != null) {
                    prev.next = trav.next;
                } else {
                    head = trav.next;
                }
            } else {
                prev = trav;
            }
            trav = trav.next;
        }

        return head;
    }
}
