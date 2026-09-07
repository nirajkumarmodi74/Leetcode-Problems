class Solution {
    public int arraySign(int[] nums) {
        int negCnt = 0;
        for(int i : nums){
            if(i==0){
                return 0;
            }
            if(i<0){
                negCnt++;
            }
        }
        
        return negCnt%2==0?1:-1;
    }
}