class Solution {
    
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] id = new int[2];
        for(int i = 0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
                if(id[1]<count){
                    id[1]=count;
                    id[0] = i;
                }
        }
        return id;
    }
}