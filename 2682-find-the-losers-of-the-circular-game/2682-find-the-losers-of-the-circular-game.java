class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] visited = new boolean[n];
        
        int current = 0;
        int step = k;
        visited[0] = true;
        while(true){
            current = (current + step)%n;
            if(visited[current]){
                break;
            }
            visited[current] = true;
            step+=k;
        }
        List<Integer> loser = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                loser.add(i+1);
            }
        }
        int[] ans = new int[loser.size()];
        for(int i=0;i<loser.size();i++){
            ans[i] = loser.get(i);
        }
        return ans;
    }
}