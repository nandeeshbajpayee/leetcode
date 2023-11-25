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
    ListNode lastnode=null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=dummy.next;
        for(int i=1;i<left;i++){
            prev=prev.next;
            curr=curr.next;
        }
        ListNode subhead=curr;
        ListNode subprev=null;
        for(int i=0;i<=(right-left);i++){
            ListNode nextnode=curr.next;
            curr.next=subprev;
            subprev=curr;
            curr=nextnode;
        }
        subhead.next=curr;
        prev.next=subprev;
        return dummy.next;
    }
}