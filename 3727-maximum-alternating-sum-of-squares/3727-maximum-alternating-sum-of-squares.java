class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length/2;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long minSum = 0;
        long maxSum = 0;
        for(int i=0;i<n;i++){
            minSum += nums[i];
        }
        for(int i=n;i<nums.length;i++){
            maxSum+=nums[i];
        }
        return maxSum-minSum;
    }
}