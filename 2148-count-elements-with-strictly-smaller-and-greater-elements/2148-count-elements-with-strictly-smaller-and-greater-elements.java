class Solution {
    static int[] maxmin(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        int[] arr = {min, max};
        return arr;
    }
    public int countElements(int[] nums) {
        int[] arr = maxmin(nums);
        int min = arr[0];
        int max = arr[1];
        int cnt = 0;
        for(int num : nums){
            if(num > min && num < max){
                cnt++;
            }
        }
        return cnt;
    }
}