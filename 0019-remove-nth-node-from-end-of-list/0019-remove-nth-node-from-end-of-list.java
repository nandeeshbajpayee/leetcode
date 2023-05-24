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
        ListNode temp=new ListNode(0, head);
        ListNode temp2=temp;
        ListNode returnnode=temp;
        while(n>0){
            temp=temp.next;
            n--;
        }
        while(temp.next!=null){
            temp=temp.next;
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return returnnode.next;
        
       // ListNode newHead = new ListNode(0);
       // newHead.next = head;
       // ListNode p = newHead;
       // ListNode runner = newHead;
       // while(n>0){
       //     runner = runner.next;
       //     n--;
       // }
       // while(runner.next!=null){
       //     runner = runner.next;
       //     p=p.next;
       // }
       // p.next = p.next.next;
       // return newHead.next;
    }
}