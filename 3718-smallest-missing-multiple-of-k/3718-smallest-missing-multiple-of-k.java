class Solution {
    public int missingMultiple(int[] nums, int k) {
        int t = k;
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        } 
        
        while(set.contains(t)){
            t+=k;
        }
        return t;
    }
}