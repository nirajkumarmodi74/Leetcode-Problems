class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        // int ans = 0;
        boolean[] visited = new boolean[nums.length+1];
        for(int num : nums){
            if(visited[num]){
                arr[0] = num;
            }
            visited[num] = true;
        }
        for(int i =1;i<=nums.length;i++){
            boolean val = visited[i]; 
            if(!val){
                arr[1] = i;
            }
        }
        return arr;
    }
}