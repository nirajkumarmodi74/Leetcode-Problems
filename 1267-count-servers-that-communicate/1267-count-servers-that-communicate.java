class Solution {
    static int m;
    static int n;
    static boolean[][] visited;
    static int cnt;
    static void dfs(int i, int j, int[][] grid, char dir){
        visited[i][j] = true;
        if(grid[i][j]==1){
            cnt++;
            grid[i][j] = -2;
            // right
            if(j+1<n) dfs(i,j+1,grid,'r');
            // left
            if(j-1>=0) dfs(i,j-1,grid,'l');
            // up
            if(i-1>=0) dfs(i-1,j,grid,'u');
            if(i+1<m) dfs(i+1,j,grid,'d');
        }
        if(grid[i][j] == 0){
            switch(dir) {
                case 'r' -> {if(j+1<n) dfs(i,j+1,grid,'r');}
                case 'l' -> {if(j-1>=0) dfs(i,j-1,grid,'l');}
                case 'u' -> {if(i-1>=0) dfs(i-1,j,grid,'u');}
                case 'd' -> {if(i+1<m) dfs(i+1,j,grid,'d');}
            }
        }
    }
    public int countServers(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    cnt = 0;
                    dfs(i,j,grid,'#');
                    if(cnt>1) ans+=cnt;
                }
            }
        }
        return ans;
    }
}