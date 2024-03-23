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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode itr = head;
        while(itr.next != null) {
            int gcd = GCD(itr.val, itr.next.val);
            ListNode gcdNode = new ListNode(gcd,itr.next);
            itr.next = gcdNode;
            itr = gcdNode.next;
        }
        return head;
    }

    public int GCD(int x, int y) {
        if (y == 0)
            return x;
        return GCD(y, Math.abs(y - x));
    }


}
