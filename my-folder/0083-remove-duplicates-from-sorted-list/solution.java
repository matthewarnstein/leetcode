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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode trav = head;
        ListNode succ = trav.next;
        while(succ != null) {
            while(succ != null && trav.val == succ.val) {
                succ = succ.next;
                trav.next = succ;
                
            }
            //succ = succ.next;
            trav = trav.next;
        }

        return head;

    }
}
