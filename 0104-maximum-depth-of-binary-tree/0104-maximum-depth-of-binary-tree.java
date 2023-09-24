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
        int depth = 1;
        
        
        return Math.max(helper(root.left, depth), helper(root.right, depth));
    }
    public int helper(TreeNode cur, int depth){
        if(cur == null){
            return depth;
        }
        depth++;
        return Math.max(helper(cur.left, depth), helper(cur.right, depth));
        
    }
    
}