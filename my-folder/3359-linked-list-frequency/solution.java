import java.util.HashMap;
import java.util.Map;

public class Solution {

    public ListNode frequenciesOfElements(ListNode head) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            frequencyMap.put(current.val, frequencyMap.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }
        
        // Step 2: Create a new linked list with the frequencies of the distinct elements.
        ListNode dummyHead = new ListNode(0); // Dummy head to simplify list operations
        ListNode tail = dummyHead;
        for (int freq : frequencyMap.values()) {
            tail.next = new ListNode(freq);
            tail = tail.next;
        }
        
        return dummyHead.next; // Return the head of the new list, skipping the dummy head.
    }
}
