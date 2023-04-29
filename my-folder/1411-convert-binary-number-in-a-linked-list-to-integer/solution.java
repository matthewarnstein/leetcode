import java.lang.*;
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
    public int getDecimalValue(ListNode head) {

        Stack<ListNode> s = new Stack<ListNode>();
        
        int size = 0;
        ListNode itr = head;
        while (itr != null) {
            s.push(itr);
            size++;
            itr = itr.next;
        }

        int pos = 0;
        int total = 0;
        while (!s.empty()) {
            ListNode curr = s.pop();
            if (curr.val > 0) {
                total += Math.pow(2,pos);
            }
            pos++;
        }
        return total;

    }
}
