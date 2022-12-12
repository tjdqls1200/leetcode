class Solution {
    int[] results;
    
    public int climbStairs(int n) {
        results = new int[n + 1];
        walk(n);
        
        return results[n];
    }
    
    public int walk(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return results[n] = 1;
        }
        
        if (results[n] != 0) {
            return results[n];
        }
        
        return results[n] = walk(n - 1) + walk(n - 2);
    }
}