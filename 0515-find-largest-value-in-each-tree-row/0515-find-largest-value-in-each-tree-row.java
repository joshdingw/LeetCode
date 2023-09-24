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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList();

        if(root == null){
            return res;
        }
        Queue<TreeNode> records = new ArrayDeque<>();

        records.add(root);
        int size = 1;

        while(!records.isEmpty()){
            int max = Integer.MIN_VALUE;
            while(size > 0){
                TreeNode temp = records.poll();
                if(temp.val > max){
                    max = temp.val;
                }
                size--;
                TreeNode right = temp.right;
                TreeNode left = temp.left;
                if(right != null){
                    records.add(right);
                }
                if(left != null){
                    records.add(left);
                }
            }
            size = records.size();
            res.add(max);
        }
        return res;
        
    }
}