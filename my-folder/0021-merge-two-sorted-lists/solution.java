public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy head for the new list
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        
        // Traverse both lists, picking the smaller value each time
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        // Attach the remaining elements, if any
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }
        
        return dummyHead.next; // Return the head of the merged list, skipping the dummy head
    }
}

