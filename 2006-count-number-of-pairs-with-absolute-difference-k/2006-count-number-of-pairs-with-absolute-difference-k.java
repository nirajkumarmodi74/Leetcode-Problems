class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        int cnt = 0;
        for (int num : nums) {
            cnt += freq.getOrDefault(num - k, 0);
            cnt += freq.getOrDefault(num + k, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return cnt;
    }
}