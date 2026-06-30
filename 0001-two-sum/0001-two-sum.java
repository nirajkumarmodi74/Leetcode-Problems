class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(res.containsKey(complement)){
                int[] arr = {res.get(complement),i};
                return arr;
            }

            res.put(nums[i], i);
        }
        return new int[] {};
    }
}