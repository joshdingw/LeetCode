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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left != null && right != null){
            return helper(left) + helper(right) + 3;
        }else if(left != null || right != null){
            return helper(left) + helper(right) + 2;
        }
        
        return 1;
    }
    public int helper(TreeNode cur){
         if(cur == null){
            return 0;
        }

        TreeNode left = cur.left;
        TreeNode right = cur.right;
        if(left != null && right != null){
            return helper(cur.left) + helper(cur.right) + 2;
        }else if(left != null || right != null){
            return helper(cur.left) + helper(cur.right) + 1;
        }
        
        return helper(cur.left) + helper(cur.right);

    }
}