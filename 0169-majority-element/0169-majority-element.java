class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        n = n/2;
        for(HashMap.Entry<Integer, Integer> data : freq.entrySet()){
            if(data.getValue()>n){
                return data.getKey();
            }
        }
        return -1;
    }
}