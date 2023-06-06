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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode trav = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (trav != null) {
            arr.add(trav.val);
            trav = trav.next;
        }
        Collections.sort(arr);
        System.out.println(arr.toString());
        
        trav = head;
        int i = arr.size();
        int c = 0;
        while (trav != null && c < i) {
            trav.val = arr.get(c);
            c++;
            trav = trav.next;
        }
        
        return head;
    }
}
