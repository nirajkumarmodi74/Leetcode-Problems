class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int num : nums){
            int temp = num;
            sum+=num;
            while(temp>0){
                digitSum+=temp%10;
                temp/=10;
            }
        }
        return Math.abs(sum-digitSum);
    }
}