class Solution {
    public static void solve(int[] nums, int index, List<Integer> out,List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(out));
            return;
        }
        // include
        int currValue = nums[index];
        out.add(currValue);
        solve(nums,index+1,out,ans);
        // backtracking
        out.remove(out.size()-1);
        solve(nums,index+1,out,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int index = 0;
        solve(nums,index,out, ans);
        return ans;
    }
}