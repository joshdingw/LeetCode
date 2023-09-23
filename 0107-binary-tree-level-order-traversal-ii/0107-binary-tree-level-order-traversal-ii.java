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
 import java.util.Collections;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<Integer> layer = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> records = new LinkedList<>();

        records.add(root);
        int size = 1;
        TreeNode temp;
        while(!records.isEmpty()){
            layer = new ArrayList<>();
            while(size > 0){
                temp = records.poll();
                layer.add(temp.val);
                TreeNode left =  temp.left;
                TreeNode right = temp.right;
                if(left != null){
                    records.add(left);
                }
                if(right != null){
                    records.add(right);
                }
                size--;

            }
            size = records.size();
            res.add(layer);
        }
        Collections.reverse(res);
        return res;

        
    }
}