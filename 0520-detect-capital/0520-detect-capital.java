class Solution {
    public boolean detectCapitalUse(String s) {
        int upper = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
        }
        boolean ans = upper==0 || upper==s.length() || (upper==1 && Character.isUpperCase(s.charAt(0)));
        return ans;
    }
}