class Solution {
    static int reverse(int n){
        int reverse = 0;
        while(n>0){
            int d = n%10;
            reverse = reverse*10 + d;
            n/=10;
        }
        return reverse;
    }
    public int alternateDigitSum(int n) {
        int sum = 0;
        int cnt = 0;
        n = reverse(n);
        while(n>0){
            if(cnt%2==0){
                sum+=n%10;
                cnt++;
            }else if(cnt%2!=0){
                sum-=n%10;
                cnt++;
            }
            n/=10;
        }
        return sum;
    }
}