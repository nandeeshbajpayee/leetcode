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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        if(size!=n){
            ListNode newhead=head;
            for(int i=0;i<size-1-n;i++){
            head=head.next;
            }
        head.next=head.next.next;
        return newhead;
        }
        return head.next;
    }
}