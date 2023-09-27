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
    LinkedList<Integer> inorder = new LinkedList<>();
    public boolean isValidBST(TreeNode root) {

        traversal(root);
        for(int i = 0; i < inorder.size() - 1; i++){
            if(inorder.get(i) >= inorder.get(i + 1)) return false;
        }
        return true;
    }
    public void traversal(TreeNode cur){
        if(cur == null){
            return;
        }
        TreeNode left = cur.left;
        TreeNode right = cur.right;

        if(left != null){
            traversal(left);
        }
        inorder.add(cur.val);
        
        if(right != null){
            traversal(right);
        }
        
    }
}