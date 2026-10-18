class Solution {
    static boolean safeToMove(int rowIdx, int colIdx, int n, char[][] board){
        int row = rowIdx;
        int col = colIdx;

        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        row = rowIdx;
        col = colIdx;
        while(col>=0 && row>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col-=1;
            row-=1;
        }
        row = rowIdx;
        col = colIdx;
        while(row<n && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col-=1;
            row+=1;
        }
        return true;
    }
    static void solve(char[][] board, int colIdx, int n, List<List<String>> ans){
        if(colIdx>=n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int rowIdx = 0;rowIdx<n;rowIdx++){
            if(safeToMove(rowIdx, colIdx,n,board)){
                board[rowIdx][colIdx] = 'Q';
                solve(board, colIdx+1,n,ans);
                board[rowIdx][colIdx] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans  = new ArrayList<>();
        int colIdx = 0;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(board,colIdx,n,ans);
        return ans;
    }
}