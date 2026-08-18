class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        for(int num : nums){
            freq[num]++;
        }
        if(k==1){
            for(int i=50;i>=0;i--){
                if(freq[i]==1){
                    return i;
                }
            }
            return -1;
        }
        if(k==nums.length){
            int ans = -1;
            for(int num : nums){
                ans = Math.max(num,ans);
            }
            return ans;
        }
        int ans = -1;
        if(freq[nums[0]]==1){
            ans = Math.max(ans,nums[0]);
        }
        if(freq[nums[nums.length-1]]==1){
            ans = Math.max(ans,nums[nums.length-1]);
        }
        return ans;
    }
}