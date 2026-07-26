class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int ri = 0;
        for(char ch : moves.toCharArray()){
            if(ch=='R'){
                ri++;
            }else if(ch=='L'){
                ri--;
            }
            else if(ch=='D'){
                up--;
            }
            else if(ch=='U'){
                up++;
            }
        }
        return (up==0 && ri==0);
    }
}