class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        int n = nums.length;
        for(int num : nums){
            arr[num]++;
        }
        int j = 0;
        for(int i=0;i<3;i++){
            while(arr[i]-->0){
                nums[j] = i;
                j++;
            }
        }
    }
}