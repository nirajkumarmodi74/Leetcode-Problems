class Solution {
    int maxm(int []nums){
        int max = -1;
        for(int i : nums){
            max = Math.max(i,max);
        }
        return max;
    }
    public int minMoves(int[] nums) {
        int max = maxm(nums);
        int sum = 0;
        for(int i : nums){
            sum+=max-i;
        }
        return sum;
    }
}