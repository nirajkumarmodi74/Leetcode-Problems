class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int thres = nums.length/3;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int elem = entry.getKey();
            int cnt = entry.getValue();
            if(cnt>thres){
                list.add(elem);
            }
        }
        return list;
    }
}