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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> records = new ArrayList<>();
        inorder(records, root);
        return records;
    }

    public void inorder(List<Integer> records, TreeNode node){
        if(node == null){
            return;
        }
        inorder(records, node.left);
        records.add(node.val);
        inorder(records, node.right);
        
    }

}