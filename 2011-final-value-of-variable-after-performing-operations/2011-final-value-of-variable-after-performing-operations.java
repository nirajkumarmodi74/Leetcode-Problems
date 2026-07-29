class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String oper : operations){
            if(oper.equals("++X")){
                ++x;
            }
            else if(oper.equals("X++")){
                x++;
            }
            else if(oper.equals("X--")){
                x--;
            }
            else if(oper.equals("--X")){
                --x;
            }
        }
        return x;
    }
}