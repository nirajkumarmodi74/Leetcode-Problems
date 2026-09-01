class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int cnt = 0;
        for (int i : nums) {
            if (i == 1) {
                cnt++;
                count = Math.max(cnt, count);
            } else {
                cnt = 0;
            }
        }
        return count;
    }
}