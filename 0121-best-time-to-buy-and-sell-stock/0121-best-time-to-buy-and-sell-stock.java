class Solution {
    public int maxProfit(int[] prices) {
       int profit=0;
        int mincost=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<mincost) mincost=prices[i];
            int cost=prices[i]-mincost;
            if(cost>profit) profit=cost;
        }
        return profit;
    }
}