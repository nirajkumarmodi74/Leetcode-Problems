class Solution {
    public boolean checkString(String s) {
        boolean val = false;
        for(char ch : s.toCharArray()){
            if(ch=='a' && val==true){
                return false;
            }
            if(ch=='b'){
                val = true;
            }
        }
        return true;
    }
}