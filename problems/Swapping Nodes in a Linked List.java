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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
       ListNode target=null;
        int counter=0;
        while(temp!=null)
        {
            counter++;
            if(counter==k)target=temp;
            temp=temp.next;
            
        }
        temp=head;
        for(int i=0;i<counter-k;i++)temp=temp.next;

        int swap=temp.val;
        temp.val=target.val;
        target.val=swap;
        
        return head;
    }
}
/*
Time complexity : O(n)
Space complexity : O(n)

problem : https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
*/