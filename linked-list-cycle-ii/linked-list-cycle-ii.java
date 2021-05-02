/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        HashSet set = new HashSet<ListNode>();
        set.add(head);
        
        while(head.next != null) {
            head = head.next;
            if(set.contains(head)) return head;
            else set.add(head);
        }
        
        return null;
        
    }
}