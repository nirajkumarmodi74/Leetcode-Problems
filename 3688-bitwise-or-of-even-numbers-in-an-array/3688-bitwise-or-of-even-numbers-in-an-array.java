class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int xor = 0;
        for(int num : nums){
            if(num%2==0){
                xor = xor|num;
            }
        }
        return xor;
    }
}