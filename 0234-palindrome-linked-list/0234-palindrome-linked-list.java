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

    public ListNode middleNOde(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null)
        {
            slow = slow.next;
            fast  = fast.next.next;
        }
        return slow;
    }
    public ListNode ReversedList(ListNode head)
    {
        if( head == null)
        {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while( present != null)

        {
            present.next = prev;
            prev = present;
            present = next;

            if( next != null)
            {
                next = next.next;
            }

        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if( head == null || head.next == null)
        {
            return true;
        }

        ListNode middle = middleNOde(head);

        ListNode secondHalf = ReversedList(middle);

        ListNode firstHalf = head;

        while( secondHalf != null )
        {
            if(firstHalf.val != secondHalf.val)
            {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}