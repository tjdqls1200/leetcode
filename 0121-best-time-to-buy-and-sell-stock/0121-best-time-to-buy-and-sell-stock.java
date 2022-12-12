class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[prices.length - 1];
        int profit = 0;
        
        if (prices.length == 1) {
            return 0;
        }
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                continue;
            }
            profit = Math.max(profit, prices[i] - min);
        }
        
        return profit;
    }
}