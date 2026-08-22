class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int s = 0;
        int e = totalRow*totalCol -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int row = mid/totalCol;
            int col = mid%totalCol;
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col]>target){
                e = mid - 1;
            }else{
                s = mid +1;
            }
        }
        return false;
    }
}