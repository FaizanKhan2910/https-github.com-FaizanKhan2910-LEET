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
        ListNode slow = head;
        ListNode fast = head;

        if( head == null || head.next == null)
        {
            return head;
        }
        while( fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode firstHalf = sortList(head);
        ListNode secondHalf = sortList(second);

        return merge(firstHalf , secondHalf);

    }

    public ListNode merge(ListNode first , ListNode second)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while( first != null && second != null)
        {
            if( first.val < second.val)
            {
                temp.next = first;
                first = first.next;
            }else 
            {
                temp.next = second;
                second = second.next;
            }

            temp = temp.next;
        }

        while( first != null)
        {
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }
         while( second != null)
        {
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }


        return dummy.next;
    }
}