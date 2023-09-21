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

        ListNode temp = head;
        int c1=1;
        if(head==null || head.next==null || k==0) return head;
        while(temp.next!=null)
        {
            c1++;
            temp = temp.next;
        }

        ListNode tail = temp;
        tail.next = head;
        int c2 = 1;
        ListNode temp2 = head;
         k = k%c1;
        int x = c1-k;
        while(temp2!=null && c2<=x)
        {
            if(c2==x)
            { 
                System.out.println(temp2.val+" -");
                head = temp2.next;
                System.out.println(head.val+" -");
                temp2.next = null;
                break;
            }
            c2++;
            temp2 = temp2.next;
        }
        return head;
        
    }
}