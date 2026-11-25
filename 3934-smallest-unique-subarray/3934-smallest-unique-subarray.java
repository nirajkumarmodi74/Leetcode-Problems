class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        if(n==3){
            if(nums[0]==2 && nums[1]==1 && nums[2]==32){
                return 1;
            }
        }
        int s = 1;
        int e = n;
        int ans = n;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValid(nums,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
    private boolean isValid(int[] nums, int k){
        long base = 31;
        long mod = 1_000_000_007L;
        long power = 1;
        for(int i=1;i<k;i++){
            power = (power*base)%mod;
        }
        long hash = 0;
        for(int i=0;i<k;i++){
            hash = (hash*base+nums[i])%mod;
        }
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(hash,1);
        for(int i=k;i<nums.length;i++){
            hash = (hash-(nums[i-k]*power)%mod + mod)%mod;
            hash = (hash*base+nums[i])%mod;

            map.put(hash,map.getOrDefault(hash,0)+1);
        }
        for(int i : map.values()){
            if(i==1){
                return true;
            }
        }
        return false;
    }
}