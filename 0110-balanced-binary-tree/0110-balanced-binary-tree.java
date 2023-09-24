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
    public boolean isBalanced(TreeNode root) {
        return (getHeight( root) != -1);
    }

    public int getHeight(TreeNode cur){
        if(cur == null){
            return 0;
        }
        TreeNode left = cur.left;
        TreeNode right = cur.right;
        int leftHeight = getHeight(left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = getHeight(right);
        if(rightHeight == -1){
            return -1;
        }
        if( Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
        
    }
}