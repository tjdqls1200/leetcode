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
    long max = 0;
    long sum = 0;
    long answer = 0;
    
    public int maxProduct(TreeNode root) {
        DFS(root);
        cutNode(root);
        
        return (int) (answer % (1e9 + 7));
    }
    
    public void DFS(TreeNode node) {
        if (node == null) {
            return;
        }
        max += node.val;
        
        DFS(node.left);
        DFS(node.right);
    }
    
    public long cutNode(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        sum = node.val + cutNode(node.left) + cutNode(node.right);
        answer = Math.max(answer, (max - sum) * sum);
        return sum;
    }
}