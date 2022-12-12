class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        
        if (prices.length == 1) {
            return 0;
        }
        
        for (int price : prices) {
            if (price < min) {
                min = price;
                continue;
            }
            profit = Math.max(profit, price - min);
        }
        
        return profit;
    }
}