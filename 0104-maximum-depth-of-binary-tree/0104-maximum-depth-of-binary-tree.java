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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> records = new LinkedList<>();
        records.add(root);
        int size = 1;
        int depth = 0;
        while(!records.isEmpty()){
            depth++;
            while(size > 0){
                TreeNode temp = records.poll();
                TreeNode left = temp.left;
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
            
        }
        return depth;
    }
}