class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = -1;
        for(int i=0;i<nums.length;i++){
            int d = -1*nums[i];
            if(nums[i]>max && set.contains(d)){
                max = nums[i];
            }
        }
        return max;
    }
}