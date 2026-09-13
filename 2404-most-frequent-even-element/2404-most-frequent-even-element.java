class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int val  = 0;
        int value = -1;
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            int key = ent.getKey();
            int freq = ent.getValue();
            if (freq > val || (freq == val && key < value)) {
                val = freq;
                value = key;
            }
        }
        return value;
    }
}