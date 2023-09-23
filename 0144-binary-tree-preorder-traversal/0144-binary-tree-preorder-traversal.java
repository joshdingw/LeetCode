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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> records = new ArrayList<>();
        preorder(records, root);
        return records;
    }
    public void preorder(List<Integer> records, TreeNode node){
        if(node == null){
            return;
        }
        records.add(node.val);
        preorder(records, node.left);
        preorder(records, node.right);
    }
}