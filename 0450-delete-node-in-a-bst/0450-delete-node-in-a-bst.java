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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        if(root.val == key){
            if(left == null && right == null){
                return null;
            }
            if(left == null && right != null){
                return right;
            }
            if(right == null && left != null){
                return left;
            }
            TreeNode temp = right;
            while(temp.left != null){
                temp = temp.left;
            }
            temp.left = left;
            return right;
        }else if(key > root.val){
            root.right = deleteNode( right, key);
        }
        else {
            root.left = deleteNode( left, key);
        }
        return root;
    }
}