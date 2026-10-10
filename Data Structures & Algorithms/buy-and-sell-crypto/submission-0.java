class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            int profit;
            if (prices[r] > prices[l]) {
                profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            }
            else 
                l = r;
            r += 1;
        }
        return maxP;
    }
}
