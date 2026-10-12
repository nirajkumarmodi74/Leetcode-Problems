class Solution {
    public static void solve(int[] arr, int idx, int count, int k, int n, List<Integer> out, List<List<Integer>> ans) {
        if (n == 0 && count == k) {
            ans.add(new ArrayList(out));
            return;
        }
        if (idx>=arr.length || count>k || n<0) {
            return;
        }
        out.add(arr[idx]);
        solve(arr, idx + 1, count + 1, k, n - arr[idx], out, ans);

        out.remove(out.size() - 1);
        solve(arr, idx + 1, count, k, n, out, ans);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int idx = 0;
        int count = 0;
        solve(arr, idx, count, k, n, out, ans);
        return ans;
    }
}