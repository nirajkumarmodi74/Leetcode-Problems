class Solution {
    private static class Server{
        int weight;
        int index;
        int freeAt;
        Server(int w, int i, int f){
            weight = w;
            index = i;
            freeAt = f;
        }
    }
    public int[] assignTasks(int[] s, int[] t) {
        int n = s.length;
        int m = t.length;
        PriorityQueue<Server> av = new PriorityQueue<>((a,b)->{
            if(a.weight != b.weight) return Integer.compare(a.weight,b.weight);
             return Integer.compare(a.index,b.index);
        });
        for(int i=0;i<n;i++){
            av.offer(new Server(s[i],i,0));
        }
        PriorityQueue<Server> busy = new PriorityQueue<>((a,b)->{
            if(a.freeAt != b.freeAt) return Integer.compare(a.freeAt,b.freeAt);
            if(a.weight != b.weight) return Integer.compare(a.weight, b.weight);
            return Integer.compare(a.index,b.index);
        });
        int[] ans = new int[m];
        int time = 0;
        for(int i=0;i<m;i++){
            time = Math.max(time, i);
            while(!busy.isEmpty() && busy.peek().freeAt<=time){
                av.offer(busy.poll());
            }
            if(av.isEmpty()){
                time = busy.peek().freeAt;
                while(!busy.isEmpty() && busy.peek().freeAt<= time){
                    av.offer(busy.poll());
                }
            }
            Server sv = av.poll();
            int idx = sv.index;
            ans[i] = idx;
            sv.freeAt = time + t[i];
            busy.offer(sv);
        }
        return ans;
    }
}