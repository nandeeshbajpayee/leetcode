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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if (size==0 || size==1){
            return head;
        }
        k=k%size;
        if( k==0 ) {
            return head;
        }
        ListNode ptr1=head;
        ListNode ptr2=head;
        while(k-->0){
            ptr2=ptr2.next;
        }
        while(ptr2.next!=null){
            ptr2=ptr2.next;
            ptr1=ptr1.next;
        }
        ListNode rethead=ptr1.next;
        ptr1.next=null;
        ptr2.next=head;
        return rethead;
    }
}