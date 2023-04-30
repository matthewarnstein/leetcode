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


    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode succ = head.next;
        
        while(succ != null) {
            curr.next = prev;
            prev = curr;
            curr = succ;
            succ = succ.next;
        }
        
        curr.next = prev;
        return curr;

    }
}
