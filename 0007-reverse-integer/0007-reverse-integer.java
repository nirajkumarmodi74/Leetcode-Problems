class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x > 0) {
            rev = (rev * 10) + x % 10;
            x /= 10;
        }
        if (x < 0) {
            x = (-1)*x;
            while (x > 0) {
                rev = (rev * 10) + x % 10;
                x /= 10;
            }
            rev = (-1)*rev;
        }
        if(rev>(Math.pow(2,31)-1)){
            rev = 0;
        }
        else if(rev<(-(Math.pow(2,31)))){
            rev = 0;
        }
        return (int)rev;
    }
}