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
    int answer = Integer.MIN_VALUE;
    
    public int maxAncestorDiff(TreeNode root) {
        DFS(root, root.val, root.val);
        
        return answer;
    }
    
    public void DFS(TreeNode node, int max, int min) {
        if (node == null) {
            return;
        }
        int newMax = Math.max(max, node.val);
        int newMin = Math.min(min, node.val);
        
        answer = Math.max(answer, Math.abs(newMax - newMin));
        
        DFS(node.left, newMax, newMin);
        DFS(node.right, newMax, newMin);
    }
}