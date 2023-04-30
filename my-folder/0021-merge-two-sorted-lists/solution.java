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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 != null) {
            return list2;
        } else if (list1 != null && list2 == null) {
            return list1;
        } else if (list1 == null && list2 == null) {
            return null;    
        }
        
    

        ListNode trav1 = list1;
        ListNode trav2 = list2;
        ListNode merged = new ListNode();
        ListNode head = merged;
        if (trav1.val <= trav2.val) {
            System.out.println("list1.val = " + trav1.val);
            merged.val = trav1.val;
            trav1 = trav1.next;
        } else {
            System.out.println("list2.val = " + trav2.val);
            merged.val = trav2.val;
            //merged = new ListNode(trav2.val);
            trav2 = trav2.next;
        }

        while (trav1 != null && trav2 != null) {
            if (trav1.val <= trav2.val) {
                System.out.println("list1.val = " + trav1.val);
                merged.next = new ListNode(trav1.val);
                merged = merged.next;
                trav1 = trav1.next;
            } else {
                System.out.println("list2.val = " + trav2.val);
                merged.next = new ListNode(trav2.val);
                merged = merged.next;
                trav2 = trav2.next;
                
            }
            //System.out.println("merged: " + merged.val);
        }

        if (trav1 == null && trav2 != null) {
            System.out.println("list2.val = " + trav2.val);
            merged.next = trav2;
         } else if (trav1 != null && trav2 == null) {
             System.out.println("list1.val = " + trav1.val);
             merged.next = trav1;
         } else if (trav1 == null && trav2 == null) {
             System.out.println("list1 & list2 null = ");
             merged.next = null;  
         }

        return head;
    }     


}
