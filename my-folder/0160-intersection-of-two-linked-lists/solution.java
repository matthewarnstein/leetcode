/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        HashSet<Object> nodes = new HashSet<Object>();
        ListNode trav = headA;
        ListNode intersection = null;

        while(trav != null) {
            nodes.add(trav.hashCode());
            trav = trav.next;
        }

        trav = headB;
        while(trav != null) {
            if (nodes.contains(trav.hashCode())) {
                intersection = trav;
                return intersection;
            } else {
                trav = trav.next;
            }
        }
        return null;


    }
}
