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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode tail=head;
        int length=1;
        while(tail.next!=null)
        {
            tail=tail.next;
            length++;
        }
        int k1=k%length;
        for(int i=0;i<k1;i++)
        {
            tail.next=head;
            ListNode temp=head;
            while(temp.next!=tail)
            {
                temp=temp.next;
            }
            head=tail;
            tail=temp;
            tail.next=null;
        }
        return head;
    }
}