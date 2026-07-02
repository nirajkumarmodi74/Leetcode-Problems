class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i=1;i<n;i++){
            left[i] = nums[i-1]*left[i-1];
        }
        for(int i=n-1;i>0;i--){
            right[i-1] = nums[i]*right[i];
        }
        for(int i=0;i<n;i++){
            int temp = right[i];
            right[i] = temp*left[i];
        }
        return right;
    }
}