class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0;
        }
        // if
        n = (int)Math.pow(10,n);
        int max = -1;
        for(int i=1;i<n;i++){
            int temp = i;
            int sum = 0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum==s){
                max = i;
            }
        }
        return max;
    }
}