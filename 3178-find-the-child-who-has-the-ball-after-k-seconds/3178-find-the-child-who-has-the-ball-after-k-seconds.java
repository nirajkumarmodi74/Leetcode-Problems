class Solution {
    public int numberOfChild(int n, int k) {
        k = k % (2*(n-1));
        return (k<n) ? k : ((2*(n-1))-k);
    }
}