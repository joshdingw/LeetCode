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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> records = new ArrayDeque<>();
        

        if(root == null){
            return res;
        }

        records.add(root);
        int size = 1;

        while(!records.isEmpty()){
            double sum = 0;
            double helper = size;   
            while(size > 0){
                TreeNode temp = records.poll();
                sum = sum + temp.val;
                size--;
                TreeNode left = temp.left;
                TreeNode right = temp.right;
                if(left != null){
                    records.add(left);
                }
                if(right != null){
                    records.add(right);
                }

            }
            res.add(sum / helper);
            size = records.size();
        }
        return res;

        
    }
}