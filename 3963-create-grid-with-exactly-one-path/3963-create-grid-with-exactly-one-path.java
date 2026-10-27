class Solution {
    public String[] createGrid(int m, int n) {
        String[] w = new String[m];
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st.append(".");
        }
        String s = st.toString();
        for (int i = 0; i < n - 1; i++) {
            st.setCharAt(i, '#');
        }
        w[0] = s;
        for (int i = 1; i < m; i++) {
            w[i] = st.toString();
        }
        return w;
    }
}