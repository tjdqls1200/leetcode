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
    Map<Integer, List<Integer>> values = new HashMap<>();
    
    public int maxAncestorDiff(TreeNode root) {
        values.put(root.val, new ArrayList<>());
        DFS(root.val, root);
        
        for (int key : values.keySet()) {
            for (int n : values.get(key)) {
                max = Math.max(max, Math.abs(key - n));
            }
        }
        
        return max;
    }
    
    public void DFS(int parent, TreeNode node) {
        if (node == null) {
            return;
        }
        if (!values.containsKey(parent)) {
            values.put(parent, new ArrayList<>());
        }
        if (node.left == null && node.right == null) {
            values.get(parent).add(node.val);
            return;
        }
        
        DFS(node.val, node.left);
        DFS(node.val, node.right);
        values.get(parent).add(node.val);
        values.get(parent).addAll(values.get(node.val));
    }
}