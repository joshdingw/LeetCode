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
    int result = 0;
    int maxDepth =Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root) {
        if(root == null){
            return 0;
        }
        traversal(root, 1);
        return result;
        
    }
    public void traversal(TreeNode cur, int depth){
        TreeNode left = cur.left;
        TreeNode right = cur.right;

        if(left == null && right == null){
            if(depth > maxDepth){
                maxDepth = depth;
                result = cur.val;
            }
        }
        if(left != null){
            depth++;
            traversal(left, depth);
            depth--;
        }
         if(right != null){
            depth++;
            traversal(right, depth);
            depth--;
        }


    }
}