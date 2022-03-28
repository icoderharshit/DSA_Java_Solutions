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
        int count=0,size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        while(temp!=null && count!=size-n-1){
            temp=temp.next;
            count++;
        }
        if(temp!=null)
        {
        if(temp.next!=null && temp.next.next!=null)
        temp.next=temp.next.next;
        else
        temp.next=null;
        }
        else{
            return head.next;
        }
        return head;
    }
}