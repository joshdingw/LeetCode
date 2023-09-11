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
    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return head;
        }

        ListNode slow = new ListNode();
        ListNode fast = new ListNode();
        
        fast = head;
        slow.next = head;
        head = slow;
        while(fast.next != null){
            if(fast.val == val){
                fast = fast.next;
                slow.next = fast;
            }else{
                slow = fast;
                fast = fast.next;
            }

        }
        if(fast.val == val){
            slow.next = fast.next;
        }
        return head.next;
    }
}