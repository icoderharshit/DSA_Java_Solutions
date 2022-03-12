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
    public boolean isPalindrome(ListNode head) {
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
    }
}