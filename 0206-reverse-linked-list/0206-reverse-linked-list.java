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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode nextNode = head.next;
        head.next = null;

        return reverse(head, nextNode);
        
    }

    public ListNode reverse(ListNode prevNode, ListNode nextNode){
        if(nextNode.next == null){
            nextNode.next = prevNode;
            return nextNode;
        }
        ListNode temp = nextNode.next;
        nextNode.next = prevNode;
        return reverse(nextNode, temp);

    }
}