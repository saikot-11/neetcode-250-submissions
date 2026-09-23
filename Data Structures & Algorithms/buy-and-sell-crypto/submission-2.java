class Solution {
    /**
    * Time Complexity: O(n)
    * Space Complexity: O(1)
    */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int maxProfit = 0;
        int sellingPrice = prices[len - 1];

        for (int i = len - 1; i >= 0; i--) {
            profit = sellingPrice - prices[i];
            maxProfit = Math.max(maxProfit, profit);
            sellingPrice = Math.max(sellingPrice, prices[i]);
        }

        return maxProfit;
    }
}
