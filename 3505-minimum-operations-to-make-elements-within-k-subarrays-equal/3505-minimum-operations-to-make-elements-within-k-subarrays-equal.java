class Solution {
    private long dp(int i, int cnt, int n, int x, long[] minOps, long[][] memo) {
        if (cnt == 0)
            return 0;
        if (i > n - (cnt * x))
            return Long.MAX_VALUE / 2;
        ;
        if (memo[i][cnt] != -1)
            return memo[i][cnt];
        long skip = dp(i + 1, cnt, n, x, minOps, memo);
        long pick = minOps[i] + dp(i + x, cnt - 1, n, x, minOps, memo);
        return memo[i][cnt] = Math.min(skip, pick);
    }

    private long[] getMinOps(int[] nums, int x) {
        int n = nums.length;
        int numWindows = n - x + 1;
        long[] minOps = new long[numWindows];
        int idx = 0;
        PriorityQueue<Integer> lw = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> up = new PriorityQueue<>();
        Map<Integer, Integer> dlyd = new HashMap<>();
        long lwSum = 0, upSum = 0;
        int lwSize = 0, upSize = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (lw.isEmpty() || num <= lw.peek()) {
                lw.add(num);
                lwSum += num;
                lwSize++;
            } else {
                up.add(num);
                upSum += num;
                upSize++;
            }
            if (i >= x) {
                int outNum = nums[i - x];
                dlyd.put(outNum, dlyd.getOrDefault(outNum, 0) + 1);
                if (!lw.isEmpty() && outNum <= lw.peek()) {
                    lwSize--;
                    lwSum -= outNum;
                } else {
                    upSize--;
                    upSum -= outNum;
                }
            }
            prune(lw, dlyd);
            prune(up, dlyd);
            if (lwSize < upSize) {

                int val = up.poll();
                lw.add(val);
                upSum -= val;
                lwSum += val;
                upSize--;
                lwSize++;
            } else if (lwSize > upSize + 1) {

                int val = lw.poll();
                up.add(val);
                lwSum -= val;
                upSum += val;
                lwSize--;
                upSize++;
            }
            prune(lw, dlyd);
            prune(up, dlyd);
            if (i >= x - 1) {
                long median = lw.peek();
                long ops = (median * lwSize - lwSum) + (upSum - median * upSize);
                minOps[idx++] = ops;
            }
        }
        return minOps;
    }

    private void prune(PriorityQueue<Integer> heap, Map<Integer, Integer> dlyd) {
        while (!heap.isEmpty()) {
            int val = heap.peek();
            int cnt = dlyd.getOrDefault(val, 0);
            if (cnt > 0) {
                if (cnt == 1) {
                    dlyd.remove(val);
                } else {
                    dlyd.put(val, cnt - 1);
                }
                heap.poll();
            } else {
                break;
            }
        }
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        long[] minOps = getMinOps(nums, x);

        long[][] memo = new long[n + 1][k + 1];
        for (long[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dp(0, k, n, x, minOps, memo);
    }

}