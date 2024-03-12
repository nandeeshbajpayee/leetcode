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
import java.util.HashMap;
import java.util.Map;

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        
        while (temp != null) {
            sum += temp.val;
            if (map.containsKey(sum)) {
                ListNode prev = map.get(sum).next;
                int psum = sum;
                while (prev != temp) {
                    psum += prev.val;
                    map.remove(psum);
                    prev = prev.next;
                }
                map.get(sum).next = temp.next;
            } else {
                map.put(sum, temp);
            }
            temp = temp.next;
        }
        
        return dummy.next;
    }
}
