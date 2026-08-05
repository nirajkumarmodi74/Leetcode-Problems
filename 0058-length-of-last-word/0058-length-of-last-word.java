class Solution {
    public int lengthOfLastWord(String s) {
        int st = s.length()-1;
        while(st>=0 && s.charAt(st)==' '){
            st--;
        }

        int end = st;
        while(end>=0 && s.charAt(end)!=' '){
            end--;
        }
        return st-end;
    }
}