class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
            set.add(num);
        }
        List<Integer> arr = new ArrayList<>();
        for(int i = min;i<=max;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}