class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int n = arrival.length;
        PriorityQueue<int[]> busy = new PriorityQueue<>((a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        int[] used = new int[k];
        for(int i=0;i<Math.min(n,k);i++){
            busy.offer(new int[]{arrival[i]+load[i],i});
            used[i]++;
        }
        TreeSet<Integer> available = new TreeSet<>();
        for(int i=k;i<n;i++){
            int t = arrival[i];
            while(!busy.isEmpty() && busy.peek()[0]<=t){
                int[] temp = busy.poll();
                available.add(temp[1]);
            }
            if(available.isEmpty()) continue;
            int value = i%k;
            Integer server = available.ceiling(value);
            if(server == null){
                server = available.first();
            }
            used[server]++;
            available.remove(server);
            busy.offer(new int[]{t+load[i],server});
        }
        int max = 0;  
        for(int i : used){
            max = Math.max(i,max);
        }  
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            if(used[i]==max){
                ans.add(i);
            }
        }
        return ans;
    }
}