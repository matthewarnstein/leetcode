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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        else if(head.next == null)
            return head;


        ListNode trav = head;
        ListNode oddHead = head;
        ListNode odd = head;
        trav = trav.next;
        ListNode evenHead = head.next;
        ListNode even = trav;
        trav = trav.next;
        while(trav != null) {
            odd.next = even.next;
            //odd = odd.next;
            if(odd.next != null) {
                odd = odd.next;
                even.next = odd.next;
            } else {
                odd.next = evenHead;
             //   odd = evenHead;
            }
            even = even.next;
            trav = even;
            odd.next = evenHead;
        }
        //odd = evenHead;

        return head;
    }
}
