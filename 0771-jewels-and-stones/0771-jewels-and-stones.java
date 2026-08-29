class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;
        for(char ch : stones.toCharArray()){
            if(jewels.indexOf(ch)!=-1){
                cnt++;
            }
        }
        return cnt;
    }
}