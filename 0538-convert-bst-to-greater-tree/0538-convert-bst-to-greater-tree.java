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
    int pre;
    public TreeNode convertBST(TreeNode root) {
        pre = 0;
        return traversal(root);
    }
    public TreeNode traversal(TreeNode cur){
        if(cur == null){
            return null;
        }
        traversal(cur.right);
        cur.val += pre;
        pre = cur.val;
        traversal(cur.left);
        return cur;



    }
}