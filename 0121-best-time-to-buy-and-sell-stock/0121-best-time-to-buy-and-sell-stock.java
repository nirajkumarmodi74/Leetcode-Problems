class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int best = 0;
        for(int i : prices){
            low = Math.min(i,low);
            best = Math.max(best, (i-low));
        }
        return best;
    }
}