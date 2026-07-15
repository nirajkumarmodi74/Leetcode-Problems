class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arr = new ArrayList<>();
        int num = 0;
        int tcount = 0;

        for(int d : nums){
            if(d == target){
                tcount++;
            }else if(d<target){
                num++;
            }
        }
        while(tcount-->0){
            arr.add(num);
            num++;
        }
        return arr;
    }
}