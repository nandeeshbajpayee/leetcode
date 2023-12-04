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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list=new ListNode();
        ListNode returnnode=list;
        int carry=0;
        while(l1!=null && l2!=null){
            int value=l1.val+l2.val+carry;
            carry=value/10;
            ListNode node = new ListNode(value%10);
            list.next=node;
            list=list.next;
            l1=l1.next;
            l2=l2.next;
            }
        while(l1!=null){
          int value=l1.val+carry;
            carry=value/10;
            ListNode node = new ListNode(value%10);
            list.next=node;
            list=list.next;
            l1=l1.next;  
        }  
        while(l2!=null){
            int value=l2.val+carry;
            carry=value/10;
            ListNode node = new ListNode(value%10);
            list.next=node;
            list=list.next;
            l2=l2.next;
            } 
        if(carry!=0) {
            ListNode node = new ListNode(carry);
            list.next=node;
        }
        return returnnode.next;
    }
}













