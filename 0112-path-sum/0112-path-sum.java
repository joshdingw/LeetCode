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
    //int targetSum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return traversal(root,targetSum);
    }
    public boolean traversal(TreeNode cur, int sum){
        TreeNode left = cur.left;
        TreeNode right = cur.right;

        if(left == null && right == null){
            System.out.println(sum );
            if((sum - cur.val) == 0){
                return true;
            }
            return false;
        }
        if(left != null && right != null){
            return traversal(left, sum - cur.val) || traversal(right, sum - cur.val);
        }
        if(right != null){
            return traversal(right, sum - cur.val);
        }
        if(left != null ){
            return traversal(left, sum - cur.val);
        }
        return false;
    }
}