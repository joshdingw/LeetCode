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
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        ListNode temp = head.next.next;
        head.next.next = head;
        head.next = temp;


        helper(head);
        return newHead;
        

    }
    public void helper(ListNode cur){

        while(cur != null && cur.next != null && cur.next.next != null){
            ListNode temp = cur.next.next.next;
            ListNode left = cur.next;
            ListNode right = cur.next.next;
            cur.next = right;
            right.next = left;
            left.next = temp;
            cur = left;
        }
        

    }
}