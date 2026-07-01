class Solution {

    public boolean isHappy(int n) {
        while (n != 4) {
            int num = n;
            int sum = 0;
            while (num > 0) {
                int d = num % 10;
                sum += d * d;
                num /= 10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
        }
        return false;
    }
}