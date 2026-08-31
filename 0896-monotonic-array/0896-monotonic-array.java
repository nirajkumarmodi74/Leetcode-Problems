class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return true;
        }
        if(nums[0]==nums[n-1]){
            for(int i=1;i<n;i++){
                if(nums[0]!=nums[i]){
                    return false;
                }
            }
            return true;
        }
        if(nums[0]<nums[n-1]){
            for(int i=1;i<n;i++){
                if(nums[i-1]>nums[i]){
                    return false;
                }
            }
        }
        if(nums[0]>nums[n-1]){
            for(int i=1;i<n;i++){
                if(nums[i-1]<nums[i]){
                    return false;
                }
            }
        }

        return true;
    }
}