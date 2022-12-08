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
    boolean flag = true;
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        DFS(p, q);
        
        return flag;
    }
    
    public void DFS(TreeNode p, TreeNode q) {
        if (!flag || (p == null && q == null)) {
            return;
        }
        
        if ((p == null || q == null) || p.val != q.val) {
            flag = false;
            return;
        }        
        
        DFS(p.left, q.left);
        DFS(p.right, q.right);
    }
}