class Solution {
    public long removeZeros(long n) {
        long num =0;
        long ten = 1;
        while(n>0){
            long p = n%10;
            System.out.println(p);
            if(p!=0){
                num+=p*ten;
                // System.out.println(num);
                ten*=10;
            }
            n/=10;
        }
        return num;
    }
}