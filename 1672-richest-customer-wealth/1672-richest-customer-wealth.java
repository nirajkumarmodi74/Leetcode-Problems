class Solution {
    public int maximumWealth(int[][] accounts) {
        int r = accounts.length;
        int sum = 0;
        for(int i=0;i<r;i++){
            int c = accounts[i].length;
            int s = 0;
            for(int j=0;j<c;j++){
                s+=accounts[i][j];
            }
            sum = Math.max(sum,s);
        }
        return sum;
    }
}