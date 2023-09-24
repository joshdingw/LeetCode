/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        List<Node> records = new LinkedList<>();
        records.add(root);
        int size = 1;

        while(!records.isEmpty()){
            List<Integer> layer = new ArrayList<>();
            while(size > 0){
                Node temp = records.get(0);
                records.remove(0);
                layer.add(temp.val);
                size--;
                Iterator<Node> itr = temp.children.iterator();
                while(itr.hasNext()){
                    records.add(itr.next());
                }
            }
            res.add(layer);
            size = records.size();

        }
        return res;
        
    }
}