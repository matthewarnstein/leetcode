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
public class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0); // Create a dummy node to simplify edge cases
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null) {
            int mCount = m;
            // Keep m nodes
            while (mCount > 0 && current.next != null) {
                current = current.next;
                mCount--;
            }
            
            int nCount = n;
            // Skip n nodes
            while (nCount > 0 && current.next != null) {
                current.next = current.next.next;
                nCount--;
            }
        }
        
        return dummy.next; // Return the modified list, excluding the dummy node
    }
}

