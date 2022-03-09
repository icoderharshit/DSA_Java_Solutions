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
    public ListNode deleteDuplicates(ListNode head) {
               // do nothing if the list is empty
        if (head == null) {
            return null;
        }
        ListNode current = head;
        // compare the current node with the next node
        while (current.next != null)
        {
            if (current.val == current.next.val)
            {
                ListNode nextNext = current.next.next;
                current.next = nextNext;
            }
            else {
                current = current.next;    // only advance if no deletion
            }
        }
 
        return head;
    }
}