class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st = new StringBuilder();
        StringBuilder ts = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '#') {
                continue;
            }
            char ch = s.charAt(i);
            if (ch == '#') {
                if (st.length() > 0) {
                    st.deleteCharAt(st.length() - 1);
                }
            } else {
                st.append(ch);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (i == 0 && t.charAt(i) == '#') {
                continue;
            }
            char ch = t.charAt(i);

            if (ch == '#') {
                if (ts.length() > 0) {
                    ts.deleteCharAt(ts.length() - 1);
                }
            } else {
                ts.append(ch);
            }
        }
        // System.out.println(st);
        // System.out.println(ts);
        return (st.toString()).equals((ts.toString()));
    }
}