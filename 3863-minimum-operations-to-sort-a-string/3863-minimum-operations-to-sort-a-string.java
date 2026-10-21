class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;
        char mn = s.charAt(0);
        char mx = s.charAt(0);
        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);
            if (ch < s.charAt(i - 1)) {
                sorted = false;
            }
            mn = (char) Math.min(ch, mn);
            mx = (char) Math.max(ch, mx);
        }
        if (sorted) {
            return 0;
        }
        if (n == 2) {
            return -1;
        }
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == mn || s.charAt(i) == mx) {
                return 2;
            }
        }
        return 3;
    }
}