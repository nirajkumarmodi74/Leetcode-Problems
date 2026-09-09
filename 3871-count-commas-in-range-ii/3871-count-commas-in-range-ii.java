class Solution {
    public long countCommas(long n) {
        if(n<=999){
            return 0;
        }
        long power = 1000;
        long ans  = 0; 
        while (power <= n) {
            ans += n - power + 1;
            power *= 1000;
        }
        return ans;
    }
}