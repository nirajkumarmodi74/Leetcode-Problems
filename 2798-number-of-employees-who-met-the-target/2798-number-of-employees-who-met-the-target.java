class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt = 0;
        for(int num : hours){
            if(num>=target){
                cnt++;
            }
        }
        return cnt;
    }
}