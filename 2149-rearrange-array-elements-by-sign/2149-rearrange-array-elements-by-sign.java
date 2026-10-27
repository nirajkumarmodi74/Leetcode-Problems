class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = 0;
        int m = 0;
        int n = nums.length;
        int[] arr = new int[n];
        n = n/2;
        int i = 0;
        for(int j : nums){
            if(j>0){
                arr[i] = j;
                i+=2;
            }
        }
        i = 1;
        for(int j : nums){
            if(j<0){
                arr[i] = j;
                i+=2;
            }
        }
        return arr;
    }
}