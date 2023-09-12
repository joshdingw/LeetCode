/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
       
        int sizeA = count(headA);
        int sizeB = count(headB);
        if(sizeA > sizeB){
           return finder(headA,headB, sizeA - sizeB);
        }

        return finder(headB,headA, sizeB - sizeA);
    }

    
    
    public int count(ListNode node){
        int count = 0;
        while(node != null){
            node = node.next;
            count++;
        }
        return count;
    }

    public ListNode finder(ListNode longer, ListNode shorter, int diff){
        for(int i = 0; i < diff; i++){
            longer = longer.next;
        }
        while(longer != shorter && longer != null && shorter != null){
            longer = longer.next;
            shorter = shorter.next;
        }

        if(longer != null && longer == shorter){
            return longer;
        }
        return null;

    }
}