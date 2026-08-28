class Solution {
    public int maxProfit(int[] prices) {
        int currProfit = 0;
        int maxPrice = prices[prices.length - 1];
        int maxProfit = 0;

        for (int i = prices.length - 2; i >= 0; i--){
            if (prices[i] < maxPrice) {
                currProfit = maxPrice - prices[i];
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                maxPrice = Math.max(maxPrice, prices[i]);
            }
        }

        return maxProfit;
    }
}
