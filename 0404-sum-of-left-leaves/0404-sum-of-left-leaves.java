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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
      
        return traversal(root);
    }
    public int traversal(TreeNode cur){
         if(cur == null){
            return 0;
        }
        TreeNode left = cur.left;
        TreeNode right = cur.right;

        if(left != null && left.left == null && left.right == null){
            if(right != null){
            return traversal(right) + left.val;
            }  
            return left.val;
        }
        if(right != null && left != null){
            return traversal(right) + traversal(left);
        }
        if(left == null && right != null){
            return traversal(right);
        }
        
        return traversal(left);
        
    }
}