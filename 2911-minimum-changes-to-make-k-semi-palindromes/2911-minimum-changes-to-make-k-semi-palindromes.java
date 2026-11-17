class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int[][] cost = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int len = j-i+1;
                int minCost = Integer.MAX_VALUE;
                for(int d=1;d<len;d++){
                    if(len%d!=0){
                        continue;
                    }
                    int changes = 0;
                    for(int r = 0;r<d;r++){
                        int left = i+r;
                        int right = i+r+((len-1-r)/d)*d;
                        while(left<right){
                            if(s.charAt(left)!=s.charAt(right)){
                                changes++;
                            }
                            left+=d;
                            right-=d;
                        }
                    }
                    minCost = Math.min(minCost, changes);
                }
                cost[i][j] = minCost;
            }
        }
        int INF = 1_000_000;
        int[][] dp = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],INF);
        }
        dp[0][0] = 0;
        for(int i=1;i<=n;i++){
            for(int parts = 1;parts<=k;parts++){
                for(int j=i-2;j>=parts-1;j--){
                    if(dp[j][parts-1]==INF){
                        continue;
                    }
                    dp[i][parts] = Math.min(dp[i][parts],dp[j][parts-1]+cost[j][i-1]);
                }
            }
        }
        return dp[n][k];
    }
}