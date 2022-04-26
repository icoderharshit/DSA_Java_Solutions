class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode tmp=current.next;
            current.next=prev;
            prev=current;
            current=tmp;
        }
        return prev;
    }
}