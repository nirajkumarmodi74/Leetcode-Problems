class Solution {
    public int countOdds(int low, int high) {
        if(low==high){
            if(low%2==0){
                return 0;
            }else{
                return 1;
            }
        }
        if(low%2==0 && high%2==0){
            return (high-low)/2;
        }
        if((low%2!=0 && high%2!=0) && (low!=high)){
            int num = 2;
            num = num + (high-low-1)/2;
            return num;
        }
        else{
            int num = 1;
            num = num + (high-low)/2;
            return num;
        }
        // return 0;
    }
}