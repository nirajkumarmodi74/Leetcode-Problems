class Solution {
    public long removeZeros(long n) {
        long num =0;
        long ten = 1;
        while(n>0){
            long p = n%10;
            if(p!=0){
                num+=p*ten;
                ten*=10;
            }
            n/=10;
        }
        return num;
    }
}