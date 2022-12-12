class Solution {
    
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] walks = new int[n + 1];
        walks[1] = 1;
        walks[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            walks[i] =  walks[i - 1] + walks[i - 2];
        }
        
        return walks[n];
    }
}