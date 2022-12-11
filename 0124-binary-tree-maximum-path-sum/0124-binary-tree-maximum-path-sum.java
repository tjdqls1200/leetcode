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
    int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        getMax(root);
        
        return max;
    }
    
    public int getMax(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftVal = Math.max(0, getMax(node.left));
        int rightVal = Math.max(0, getMax(node.right));
        
        max = Math.max(max, node.val + leftVal + rightVal);
        
        return node.val + Math.max(leftVal, rightVal);
    }
}