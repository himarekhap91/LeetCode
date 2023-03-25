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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next; // We need this because even will get destroyed in the while loop when we do even = even.next 
        
        // Even is used in the while loop because even reaches the end of the list first 
        // even = head.next during 1st step 
        while(even != null && even.next != null){
        
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}