class Solution {
    public String removeOuterParentheses(String s) {
        int p = 0;
        int l = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = l; i < n; i++) {
            if (s.charAt(i) == '(') {
                p++;
            } else {
                p--;
                if (p == 0) {
                    sb.append(s.substring(l + 1, i));
                    l = i + 1;
                }
            }
        }
        return sb.toString();
    }
}