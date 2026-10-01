class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int min = 0;
        for(int i = 0;i<num.length();i++){
            if(num.charAt(i)!='0'){
                max = i;
                break;
            }
        }
        for(int i = num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                min = i;
                break;
            }else{
                continue;
            }
        }
        return num.substring(max,min+1);
    }
}