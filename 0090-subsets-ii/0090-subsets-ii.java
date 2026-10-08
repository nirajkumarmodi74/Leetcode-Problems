class Solution {
    public static void solve(int[] nums, int idx, List<Integer> out, List<List<Integer>> ans){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(out));
            return;
        }
        int currValue = nums[idx];
        // Include
        out.add(currValue);
        solve(nums, idx+1,out, ans);
        // Exclude but we have to check after check same number cant go bcz duplicates are not allowed
        out.remove(out.size()-1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        solve(nums,idx+1,out,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int idx = 0;
        solve(nums,idx,out,ans);
        return ans;
    }
}