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
    public int pairSum(ListNode head) {
        if(head.next.next == null)
            return head.val + head.next.val;

        int size = 0;
        ListNode trav = head;
        while(trav != null) {
            size++;
            trav = trav.next;
        }
        int lowerLeft = 0;
        Double lowerMidDouble = Math.floor(size/2.0);
        int lowerRight = lowerMidDouble.intValue() - 1;

        Double upperMidDouble = Math.ceil(size/2.0);
        int upperLeft = upperMidDouble.intValue();
        int upperRight = size - 1;

        trav = head;
        int index = 0;
        LinkedList<Integer> leftTwin = new LinkedList<Integer>();
        LinkedList<Integer> rightTwin = new LinkedList<Integer>();
        while(trav != null) {
            if(index <= lowerRight) {
                leftTwin.add(trav.val);
            } else if(index >= upperLeft && index <= upperRight) {
                rightTwin.add(trav.val);
            }
            index++;
            trav = trav.next;
        }

        int max = Integer.MIN_VALUE;
        while(!leftTwin.isEmpty() && !rightTwin.isEmpty()) {
            int sum = leftTwin.pollLast() + rightTwin.pollFirst();
            if(sum > max)
                max = sum;
        }
        
    return max;

    }
}
