class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int min = prices[0];
        int max = prices[prices.length - 1];
        int record = 0;
        int profit = prices[1] - prices[0];
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                record = i;
            }
            if (prices[i] > max && i > record) {
                max = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }
    
        if (profit < 0) {
            return 0;
        }
        
        return profit;
    }
}