/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public String gameResult(ListNode head) {
        int evenPoints = 0, oddPoints = 0; // Track points for Even and Odd teams

        ListNode current = head;
        while (current != null && current.next != null) {
            // Current node is even-indexed, and current.next is odd-indexed
            if (current.val > current.next.val) {
                evenPoints++; // Even team wins the point for this pair
            } else if (current.val < current.next.val) {
                oddPoints++; // Odd team wins the point for this pair
            }
            // Move to the next pair
            current = current.next.next;
        }

        // Determine the winner
        if (evenPoints > oddPoints) {
            return "Even";
        } else if (oddPoints > evenPoints) {
            return "Odd";
        } else {
            return "Tie";
        }
    }
}
