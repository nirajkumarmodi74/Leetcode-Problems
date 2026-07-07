class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder num = new StringBuilder();
        long sum = 0;
        if(n==0){
            return 0;
        }
        while(n>0){
            int d = n%10;
            if(d!=0){
                num.append(d);
                sum+=d;
            }
            n/=10;
        }
        n = Integer.parseInt(num.reverse().toString());
        sum *=n;

        return sum;
    }
}