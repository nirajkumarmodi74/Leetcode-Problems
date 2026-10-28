class Solution {
    public String largestEven(String s) {
        int i = s.length()-1;
        for(i=s.length()-1;i>=0;i--){
            int t = s.charAt(i)-'0';
            if(t!=1){
                break;
            }
        }
        if(i<0){
            return "";
        }
        String ss = s.substring(0,i+1);
        return ss;
    }
}