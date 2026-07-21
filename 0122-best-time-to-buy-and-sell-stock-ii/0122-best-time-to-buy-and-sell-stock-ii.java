class Solution {
    public int maxProfit(int[] prices) {
        int kh = 0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                kh+=(prices[i]-prices[i-1]);
            }
        }
        return kh;
    }
}