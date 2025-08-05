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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        if(head.next==null)
        {
            return null;
        }
        ListNode dummy=new ListNode(0,head);
        ListNode first=dummy;
        ListNode last=dummy;
        int count=0;
        while(first!=null)
        {
            first=first.next;
            if(count>n)
            {
                last=last.next;
            }
            count++;
        } 
        last.next=last.next.next;
        return dummy.next;
        
    }
}