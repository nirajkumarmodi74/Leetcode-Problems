class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int k=1;k<=n;k++){
            if(n%k!=0){
                continue;
            }
            int block = n/k;
            int[] min  = new int[block];
            int[] max  = new int[block];
            boolean valid = true;
            for(int b=0;b<block;b++){
                int st = b*k;
                int end = st+k;
                min[b] = nums[st];
                max[b] = nums[st];
                int des = 0;
                for(int i=st;i<end;i++){
                    min[b] = Math.min(min[b],nums[i]);
                    max[b] = Math.max(max[b],nums[i]);
                    int nxt = (i+1==end) ? st:i+1;
                    if(nums[i]>nums[nxt]){
                        des++;
                    }
                }
                if(des>1){
                    valid = false;
                    break;
                }
            }
            if(!valid){
                continue;
            }
            for(int b=0;b<block-1;b++){
                if(max[b]>min[b+1]){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans+=k;
            }
        }
        return ans;
    }
}