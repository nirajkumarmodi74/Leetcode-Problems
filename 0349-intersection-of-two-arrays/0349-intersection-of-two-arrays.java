class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();
        for(int num : nums1){
            arr1.add(num);
        }
        for(int num : nums2){
            arr2.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:arr1){
            if(arr1.contains(num) && arr2.contains(num)){
                res.add(num);
            }
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for(int num : res){
            arr[i++] = num;
        }
        return arr;
    }
}