class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num;
        int ans  = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mid>(num/mid)){
                e = mid-1;
            }else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans == num / ans && num % ans == 0;
    }
}