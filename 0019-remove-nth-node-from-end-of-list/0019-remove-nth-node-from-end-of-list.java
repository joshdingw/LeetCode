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
        ListNode temp = head;
        if(head == null){
            return head;
        }
        if(count(head) == n){
            return head.next;
        }
        while(temp.next != null){
            System.out.println(count(temp));
            if(count(temp) != n + 1 ){
                temp = temp.next;
            }else{
                break;
            }
        }
        System.out.println(temp.val);

        temp.next = temp.next.next;
        return head;
    }

    public int count(ListNode node){
        if(node.next == null){
            return 1;
        }
        
        return count(node.next) + 1;
        
    }
}