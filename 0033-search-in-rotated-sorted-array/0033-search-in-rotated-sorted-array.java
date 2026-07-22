class Solution {

    static int pivotIndex(int[] nums) {
        int n = nums.length;
        if (nums[0] < nums[n - 1]) {
            return -1;
        }
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[n - 1]) {
                s = mid + 1;
                ans = mid;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] nums, int target, int s, int e){
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                ans  = mid;
                return ans;
            }else if(nums[mid]>target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = pivotIndex(nums);
        if(pivot==-1){
        int t = binarySearch(nums,target,start,end);
        return t;
        }
        if(target<=nums[pivot] && target>=nums[0]){
        int t = binarySearch(nums,target,start,pivot);
        return t;
        }
        if(target<=nums[end] && target>=nums[pivot+1]){
        int t = binarySearch(nums,target,pivot+1,end);
        return t;
        }
        return -1;
    }
}