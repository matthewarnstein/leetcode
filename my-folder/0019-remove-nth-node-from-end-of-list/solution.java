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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode trav = head;
        int size = 0;

        while (trav != null) {
            trav = trav.next;
            size++;
        }
        if (size == 1) {
            head = null;
            return head;
        }
        int pos = size - n;
        trav = head;
        int index = 1;
        if (pos == 0) {
            head = trav.next;
            return head;
        }
        while (trav != null && trav.next != null) {
            if (index == pos) {
                trav.next = trav.next.next;
            }
            trav = trav.next;
            index++;
        }
        return head;


    }
}
