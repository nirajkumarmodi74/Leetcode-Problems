class Solution {
    public int minimumChairs(String s) {
        int chair = 0;
        int maxChair = 0;
        for(char c : s.toCharArray()){
            if(c=='E'){
                chair++;
                maxChair = Math.max(maxChair, chair);
            }else{
                chair--;
            }
        }
        return maxChair;
    }
}