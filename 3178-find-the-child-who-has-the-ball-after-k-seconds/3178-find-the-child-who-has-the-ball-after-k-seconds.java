class Solution {
    public int numberOfChild(int n, int k) {
        k = k % (2*(n-1));
        if(k>=n){
            return (n-1) - Math.abs(k-(n-1));
        }
        return k;
    }
}