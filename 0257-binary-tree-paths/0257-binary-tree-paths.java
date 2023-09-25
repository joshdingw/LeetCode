/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(root == null){
            return res;
        }
        
        traversal(root, path, res);
        return res;


    }
    
    public void traversal(TreeNode cur, List<Integer> path, List<String> res){
        if(cur == null){
            return;
        }
        path.add(cur.val);
        if(cur.left == null && cur.right == null){
            res.add(merge(path));
        }
        if(cur.left != null){
            traversal(cur.left, path, res);
            path.remove(path.size() - 1);
        }
        if(cur.right != null){
            traversal(cur.right, path, res);
            path.remove(path.size() - 1);
        }

    }
    public String merge(List<Integer> path){
        String s = "";
        for(int i = 0; i < path.size() - 1; i++){
            s +=   (path.get(i) + "->");
        }
        s = s + path.get(path.size() - 1);
        return s;
    }
}