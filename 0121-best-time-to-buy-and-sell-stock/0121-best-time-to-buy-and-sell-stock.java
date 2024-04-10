class Solution {
    public int maxProfit(int[] prices) {
        int minval=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price : prices){
            minval=Math.min(minval,price);
            maxprofit=Math.max(maxprofit, price-minval );
        }
        return maxprofit;
    }
}