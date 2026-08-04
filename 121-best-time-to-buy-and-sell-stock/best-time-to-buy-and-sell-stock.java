class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            int sell = prices[i];
            int profit = sell-buy;
            maxProfit = Math.max(maxProfit, profit);

            if(sell<buy){
                buy = sell;
            }
        }
        return maxProfit;
    }
}