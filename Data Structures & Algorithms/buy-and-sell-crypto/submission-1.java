class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int sellingPrice = prices[prices.length - 1];

        for (int i = prices.length - 2; i >= 0; i--) {
            int profit = sellingPrice - prices[i];
            maxProfit = Math.max(maxProfit, profit);

            if (sellingPrice < prices[i]) {
                sellingPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
