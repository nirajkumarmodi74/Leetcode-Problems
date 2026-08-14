class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int sum = 0;
        for(int num : freq.keySet()){
            int val = freq.get(num);
            if(val==1){
                sum+=num;
            }
        }
        return sum;
    }
}