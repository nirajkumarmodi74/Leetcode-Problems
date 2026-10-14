class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while(sum>0){
            if(sum<9){
                sb.append(sum);
                sum = 0;
            }else{
                sb.append('9');
                sum-=9;
            }
        }
        while(sb.length()<num){
            sb.append(0);
        }
        return sb.toString();
    }
}