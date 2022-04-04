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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> ar=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
        int front=0,rear=ar.size();
        Collections.swap(ar,front+k-1,rear-k);                      
        ListNode dummy=new ListNode(0);
        temp = dummy;             
        for(int i=0;i<ar.size();i++){
            temp.next = new ListNode(ar.get(i), temp.next);
            temp = temp.next;
        }
        temp.next=null;
        return dummy.next;
    }
}