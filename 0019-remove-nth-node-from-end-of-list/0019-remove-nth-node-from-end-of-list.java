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
//24th Feb 2022
// As we need to deleted nth from end and we this is a singly linked list and doesnt have previous pointer, we need to calculate the node from beginning
//Inorder to do that calculate the total length of linked list 
// length - n gives the position from the beginning 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        int length = 0;

        while(first != null){
            first = first.next;
            length++;
        }
        
        length = length - n;
        
        head = dummy;
        for(int i = 0; i < length ; i++){
            head = head.next;
        }
        
        if(head.next != null){
            head.next = head.next.next;
        }
        
     
        
        return dummy.next;
    }
}