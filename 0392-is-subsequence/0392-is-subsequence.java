class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int m = s.length();
        int i = 0;
        int j = 0;
        // if(s.length()==0 ){
        //     return true;
        // }
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i==m;
    }
}