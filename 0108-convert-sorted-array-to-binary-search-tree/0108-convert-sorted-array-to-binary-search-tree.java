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
    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        if(length == 0) return null;
        if(length == 1) return new TreeNode(nums[0], null, null);
        int mid = length / 2;

        return new TreeNode(nums[mid], sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid)), sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, length)));
    }
}