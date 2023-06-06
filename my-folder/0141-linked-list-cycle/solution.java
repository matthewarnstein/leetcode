/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        Set<Object> list = new HashSet<Object>();
        ListNode trav = head;

        while(trav != null) {
            if (list.contains(trav.hashCode())) {
                return true;
            } else {
                list.add(trav.hashCode());
                trav = trav.next;
            }
        }

        return false;

    }
}
