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
        // if(root == null){
        //     return true;
        // }
        // TreeNode left = root.left;
        // TreeNode right = root.right;
        // if(left == null && right == null){
        //     return true;
        // }
        // if(left != null && right == null){
        //     if(left.val >= root.val) return false;
        //     return isValidBST(root.left);
        // }
        // if(right != null && left == null){
        //     if(right.val <= root.val) return false;
        //     return isValidBST(root.right);
        // }
        // if(left.val >= root.val || right.val <= root.val) return false;
        // return  isValidBST(root.left) && isValidBST(root.right);

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