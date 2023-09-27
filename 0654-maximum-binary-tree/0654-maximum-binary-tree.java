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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        if(nums.length == 1){
            return new TreeNode(nums[0], null, null);
        }
        int maxIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }    
        int[] leftInt = Arrays.copyOfRange(nums,0, maxIndex);
        int[] rightInt = Arrays.copyOfRange(nums,maxIndex + 1, nums.length);
        return new TreeNode(nums[maxIndex], constructMaximumBinaryTree(leftInt), constructMaximumBinaryTree(rightInt));
    }
    
}