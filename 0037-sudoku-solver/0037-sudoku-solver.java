class Solution {
    static boolean findEmptyCell(char[][]board,int []emptyCell){
        for(int i=0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]=='.'){
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isSafeToPlace(char[][] board, char charVal, int rowIdx, int colIdx){
        for(int col =0;col<9;col++){
            if(board[rowIdx][col]==charVal){
                return false;
            }
        }
        for(int row=0;row<9;row++){
            if(board[row][colIdx] ==charVal){
                return false;
            }
        }
        int startRow = rowIdx - rowIdx%3;
        int startCol = colIdx - colIdx%3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]==charVal){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean solveSudokoHelper(char[][] board){
        int[] emptyCell = new int[2];
        if(!findEmptyCell(board,emptyCell)){
            return true;
        }
        int row = emptyCell[0];
        int col = emptyCell[1];
        for(int val = 1;val<=9;val++){
            char charVal = (char)(val+'0');
            if(isSafeToPlace(board,charVal,row,col)){
                board[row][col] = charVal;
                if(solveSudokoHelper(board)==true){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solveSudokoHelper(board);
    }
}