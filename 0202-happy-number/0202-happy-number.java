class Solution {
    private int getSum(int n) {
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getSum(slow);          // 1 step
            fast = getSum(getSum(fast));  // 2 steps 
        } while (slow != fast);

        return slow == 1;
    }
}