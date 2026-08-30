class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 1;
        }
        if(n==2 || n==3){
            return 2;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minId = -1;
        int maxId = -1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxId = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minId = i;
            }
        }
        int a = Math.min(maxId,minId);
        int b = Math.max(maxId, minId);
        // if both values are from starting side then we have to use this b+1 because b is max value
        // if both values are from ending side then we have to use this n-a because a is ending point from ending elements of the array 
        //  if we have to use one from starting and one from ending we have to use this a+1+n-b
        int ans = Math.min(b+1,Math.min(n-a,(a+1+n-b)));
        return ans;
    }
}