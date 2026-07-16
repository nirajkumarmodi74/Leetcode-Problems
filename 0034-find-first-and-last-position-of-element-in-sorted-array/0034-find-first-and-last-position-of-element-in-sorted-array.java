class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr =  {firstTarget(nums, target),secondTarget(nums,target)};
        return arr;
    }
    static int firstTarget(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                ans  = mid;
                e = mid-1;
            }else if(nums[mid]>target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    static int secondTarget(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                ans  = mid;
                s = mid + 1;
            }else if(nums[mid]>target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
}