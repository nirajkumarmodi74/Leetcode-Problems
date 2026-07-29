class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String oper : operations){
            if(oper.charAt(1)=='+'){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}