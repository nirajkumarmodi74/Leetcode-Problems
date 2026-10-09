class Solution {
    static void solve(int[] candidates, int target,int idx, List<Integer> out,List<List<Integer>> ans){
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList(out));
            return;
        }
        if(idx>=candidates.length){
            return;
        }
        out.add(candidates[idx]);
        solve(candidates,target-candidates[idx],idx,out,ans);

        out.remove(out.size()-1);

        solve(candidates,target,idx+1,out,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        int idx = 0;
        solve(candidates,target,idx,out,ans);
        return ans;
    }
}