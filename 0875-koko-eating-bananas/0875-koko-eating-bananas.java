class Solution {
    int maxm(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    long hour(int[] piles, int h) {
        long th = 0;
        for (int i : piles) {
            th += (i + (long) h- 1)/h;
        }
        return th;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = maxm(piles);
        int s = 1;
        int e = max;
        int ans = max;
        System.out.println(max);
        while (s <= e) {
            int mid = s + (e - s) / 2;
            long th = hour(piles, mid);
            if (th <= h) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}