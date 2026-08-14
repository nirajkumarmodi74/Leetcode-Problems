class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(int count : freq.values()){
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }
}