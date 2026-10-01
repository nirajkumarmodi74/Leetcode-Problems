class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<>();
        HashSet<Integer> arr2 = new HashSet<>();
        for(int num : nums1){
            arr1.add(num);
        }
        for(int num : nums2){
            arr2.add(num);
        }
        for(int num : nums1){
            if(arr1.contains(num) && arr2.contains(num)){
                return num;
            }
        }
        return -1;
    }
}