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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
         if( left == right)
        {
            return head;
        }  

        ListNode current = head;
        ListNode prev = null;
      
        //left se pahle ko vaisich rakho 
        for(int i = 1 ; i < left ; i++)
        {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse karo ab left se right tak 
        for(int i = 0  ; i < right - left +1; i++ )
        {
              ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }
          
        
        if( last != null)
        {
            last.next = prev;
        }else 
        {
            head = prev;
        }

        newEnd.next = current;
        return head; 



    }
}