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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
     return prev;
    }
    public boolean isPalindrome(ListNode head) {
        /* Time complexity: O(n) but Space complexity: O(n)
        ListNode temp=head;
        List<Integer> a=new ArrayList<>();
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        List<Integer> b=new ArrayList<>(a); 
        Collections.reverse(b);
        if(a.equals(b))
            return true;
        return false;
        */
        // Optimised solution constant space
        if(head==null)
            return true;
        ListNode mid=middle(head);
        ListNode last=reverse(mid);
        ListNode curr=head;
        while(last!=null){
            if(last.val!=curr.val)
                return false;
            last=last.next;
            curr=curr.next;
        }
        return true;
    }
}