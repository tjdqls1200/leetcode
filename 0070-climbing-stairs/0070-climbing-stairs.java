class Solution {
    int[] results;
    
    public int climbStairs(int n) {
        results = new int[n + 1];
        walk(n);
        
        return results[n];
    }
    
    public int walk(int n) {
        if (n == 1 || n == 2) {
            return results[n] = n;
        }
        
        if (results[n] != 0) {
            return results[n];
        }
        
        return results[n] = walk(n - 1) + walk(n - 2);
    }
}