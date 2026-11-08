class Solution {
    public int maxProfit(int[] prices) {
        int buy=0,sell=1,profit=0;
        while(true){
            if(sell==prices.length) return profit;
            if(prices[buy]<prices[sell])
            {
                profit+=prices[sell]-prices[buy];
                
            }
            sell++;
            buy++;
        } 
    }
}