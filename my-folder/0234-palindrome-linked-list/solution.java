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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        
        ListNode trav = head;
        Stack<Integer> copy = new Stack<Integer>();
        ListNode palindrome = new ListNode();
        
        while (trav != null) {
            copy.push(trav.val);
            trav = trav.next;
        }
        ListNode palindromeHead = palindrome;
        palindrome.val = copy.pop();
        while (!copy.isEmpty()) {
            palindrome.next = new ListNode(copy.pop());
            palindrome = palindrome.next;
        }

        while (head != null && palindromeHead != null) {
            if (head.val != palindromeHead.val) {
                return false;
            } else {
                head = head.next;
                palindromeHead = palindromeHead.next;
            }
        }

        return true;


    }
}
