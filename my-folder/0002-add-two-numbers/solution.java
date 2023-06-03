import java.util.*;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode ret = res;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;

        while (t1 != null && t2 != null) {
            int sum = t1.val + t2.val + carry;
            int ones = sum % 10;
            carry = sum / 10;
            res.next = new ListNode(ones);
            res = res.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        while (t1 == null && t2 != null) {
            int sum = t2.val + carry;
            int ones = sum % 10;
            carry = sum / 10;
            res.next = new ListNode(ones);
            res = res.next;
            t2 = t2.next;
        }
        while (t1 != null && t2 == null) {
            int sum = t1.val + carry;
            int ones = sum % 10;
            carry = sum / 10;
            res.next = new ListNode(ones);
            res = res.next;
            t1 = t1.next;
        }
        if (carry != 0) {
            res.next = new ListNode(carry);
            //res = res.next;
        }

        return ret.next;
    }
}
