class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        while(s<=e){
            int sum = numbers[s]+numbers[e];
            if(sum==target){
                // arr[0] = s;
                // arr[1] = e;
                // break;
                return new int[]{s+1,e+1};
            }
            if(sum>target){
                e--;
            }else{
                s++;
            }
        }
        return new int[]{-1,-1};
    }
}