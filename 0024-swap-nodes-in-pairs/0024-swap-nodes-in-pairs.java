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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode dup=dummy;
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            ListNode first=temp.next.next;
            ListNode second = temp.next;
            dup.next=second;
            second.next=temp;
            temp.next=first;

            dup=temp;
            temp=first;
        }
        return dummy.next;
    }
}