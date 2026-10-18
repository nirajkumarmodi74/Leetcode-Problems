class Solution {
    static final int MOD = 1_000_000_007;
    int[][] comb;
    public int numOfWays(int[] nums) {
       int n = nums.length;
       comb = new int[n][n];
       for(int i=0;i<n;i++){
        comb[i][0] = 1;
        comb[i][i] = 1;
        for(int j=1;j<i;j++){
            comb[i][j] = (int)(((long) comb[i-1][j-1] + comb[i-1][j])%MOD);
        }
       } 
       return (int) ((dfs(nums)-1+MOD)%MOD);
    }
    private long dfs(int[] nums){
        int n = nums.length;
        if(n<=2){
            return 1;
        }
        int root = nums[0];
        int[] left = new int[n];
        int[] right = new int[n];
        int l = 0, r= 0;
        for(int i=1;i<n;i++){
            if(nums[i]<root){
                left[l++] = nums[i];
            }else{
                right[r++] = nums[i];
            }
        }
        int[] leftArr = new int[l];
        int[] rightArr = new int[r];
        System.arraycopy(left,0,leftArr,0,l);
        System.arraycopy(right,0,rightArr,0,r);
        long leftWays = dfs(leftArr);
        long rightWays = dfs(rightArr);
        long ways = comb[n - 1][l];
        ways = ways * leftWays%MOD;
        ways = ways * rightWays%MOD;
        return ways;
    }
}