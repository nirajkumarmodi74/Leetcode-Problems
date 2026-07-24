class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int pos = n-1;
        int[] ans = new int[n];
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[pos--] = nums[l]*nums[l];
                l++;
            }else{
                ans[pos--] = nums[r]*nums[r];
                r--;
            }
        }
        return ans;
    }
}