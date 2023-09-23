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
 import java.util.Collections;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> records = new ArrayList<>();
        Stack<TreeNode> store = new Stack<>();
        TreeNode temp;
        if(root == null){
            return records;
        }
        store.push(root);
        while(!store.empty()){
            temp = store.pop();
            if(temp.right != null){
                store.push(temp.right);
            }
            if(temp.left != null){
                store.push(temp.left);
            }
            records.add(temp.val);
        }
        return records;
    }
}