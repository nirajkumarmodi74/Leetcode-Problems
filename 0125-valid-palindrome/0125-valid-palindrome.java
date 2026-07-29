class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder w = new StringBuilder();
        s = s.trim();
        if(s.length()<1){
            return true;
        }
        for(char ch : s.toCharArray()){
            ch = Character.toLowerCase(ch);
            if(Character.isLetterOrDigit(ch)){
                w.append(ch);
            }
        }
        s = w.toString();
        String str = w.reverse().toString();
        return s.equals(str);
    }
}