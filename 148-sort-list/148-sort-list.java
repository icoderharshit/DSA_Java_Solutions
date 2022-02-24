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
public ListNode sortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ArrayList<Integer> list = new ArrayList();
        ListNode temp = head;
    while(temp!=null){
        list.add(temp.val); 
        temp=temp.next;
    }
        Collections.sort(list);
        ListNode dummyHead = dummy;
        for(int i =0; i<list.size(); i++){
        dummyHead.next = new ListNode(list.get(i));
        dummyHead = dummyHead.next;
        }
        return dummy.next;
    }
}