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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=counting(head,0);
        if(count<k)return head;
        ListNode prev=null;
        ListNode next=null;
        ListNode current=head;
        int co=0;
        while(current!=null && co<k)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            co++;
        }
        if(current!=null)
        {
            head.next=reverseKGroup(current,k);
        }
        return prev;
    }
    public int counting(ListNode temp,int k)
    {
        if(temp==null)
        {
            return k;
        }
        k++;
        temp=temp.next;
        return counting(temp,k);
    }
}