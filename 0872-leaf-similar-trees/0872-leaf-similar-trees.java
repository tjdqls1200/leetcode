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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {    
        List<Integer> root1Leaf = new ArrayList<>();
        List<Integer> root2Leaf = new ArrayList<>();
        
        DFS(root1, root1Leaf);
        DFS(root2, root2Leaf);
        
        if (root1Leaf.size() != root2Leaf.size()) {
            return false;
        }
        
        for (int i = 0; i < root1Leaf.size(); i++) {
            if (root1Leaf.get(i) != root2Leaf.get(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public void DFS(TreeNode root, List<Integer> rootLeaf) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            rootLeaf.add(root.val);
            return;
        }
        
        DFS(root.left, rootLeaf);
        DFS(root.right, rootLeaf);
    }
}