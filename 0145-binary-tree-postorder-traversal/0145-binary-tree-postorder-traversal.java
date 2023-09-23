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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> records = new ArrayList<>();
        postorder(records, root);
        return records;
    }
    public void postorder(List<Integer> records, TreeNode node){
        if(node == null){
            return;
        }
        postorder(records, node.left);
        postorder(records, node.right);
        records.add(node.val);
    }

}