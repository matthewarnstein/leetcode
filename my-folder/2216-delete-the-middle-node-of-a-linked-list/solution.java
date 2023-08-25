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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
            return null;
        else if(head.next == null)
            return null;
        int size = 0;
        int mid = 0;

        ListNode trav = head;
        while(trav != null) {
            size++;
            trav = trav.next;
        }
        Double doubleMid = Math.floor((double)size/2);
        mid = doubleMid.intValue();

        trav = head;
        int index = 0;
        while(trav != null) {
            if(index + 1 == mid) {
                trav.next = trav.next.next;
                return head;
            } else {
                index++;
                trav = trav.next;
            }
        }
        //System.out.println("size: " + size + " | mid: " + mid);

        return head;


    }
}
