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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        
        // Before fast reaches the end, if we find slow = fast , then we found cycle
        // If we reached the end and no cycle is found then return false
        
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false; // We reached the end and didnt find 
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return true;
    }
}