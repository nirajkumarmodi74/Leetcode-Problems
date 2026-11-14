class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i+1] = arr[i] + nums.get(i);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int len = l;len<=r;len++){
                int j = i+len;
                if(j>n) break;
                int sum = arr[j]-arr[i];
                if(sum>0){
                    ans = Math.min(ans,sum);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}