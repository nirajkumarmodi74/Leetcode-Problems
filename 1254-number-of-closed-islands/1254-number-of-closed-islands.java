class Solution {
    static boolean dfs(int[][] grid, int i,int j){
        int r = grid.length;
        int c = grid[0].length;
        if(i<0 || i>=r || j<0 || j>=c){
            return false;
        }
        if(grid[i][j] == 1){
            return true;
        }
        grid[i][j] = 1;
        
        boolean right = dfs(grid, i,j+1);
        boolean left = dfs(grid, i,j-1);
        boolean up = dfs(grid,i-1,j);
        boolean down = dfs(grid,i+1,j);

        return right && left && up && down;
    }
    public int closedIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}