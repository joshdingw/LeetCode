/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        LinkedList<Node> records = new LinkedList<>();
        records.add(root);
        int size = 1;
        while(!records.isEmpty()){
            while(size > 0){
                Node cur = records.poll();
                if(size == 1){
                    cur.next = null;
                }else{
                    cur.next = records.peek();
                }
                size--;
                Node left = cur.left;
                Node right = cur.right;
                if(left != null){
                    records.add(left);
                }
                if(right != null){
                    records.add(right);
                }
            }
            size = records.size();
        }

        
        return root;

    }
}