class Solution {
    static final int mod = 1_000_000_007;
    long[] sum,sq,laz;
    int n;
    public int sumCounts(int[] nums) {
        n = nums.length;
        sum = new long[4*n];
        sq = new long[4*n];
        laz = new long[4*n];
        Map<Integer, Integer> last = new HashMap<>();
        long ans = 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            int p = last.getOrDefault(x,-1);
            if(p+1<=i-1){
                rangeAdd(1,0,n-1,p+1,i-1,1);
            }
            pointSet(1,0,n-1,i,1);
            last.put(x,i);
            ans = (ans+sq[1])%mod;
        }
        return (int)ans;
    }
     void apply(int node, int l,int r, long val){
        long len = r-l+1L;
        sq[node] = (sq[node]+2L * val%mod * sum[node]%mod + val*val%mod * len%mod)%mod;
        sum[node] = (sum[node]+val*len)%mod;
        laz[node] = (laz[node] + val)%mod;
    }
     void push(int node,int l,int r){
        if(laz[node] == 0 || l==r) return;
        int mid = l+(r-l)/2;
        apply(node*2,l,mid,laz[node]);
        apply(node*2+1,mid+1,r,laz[node]);
        laz[node] = 0;
    }
     void pull(int node){
        sum[node] = (sum[node*2]+sum[node*2+1])%mod;
        sq[node] = (sq[node*2]+sq[node*2+1])%mod;
    }
     void rangeAdd(int node, int l, int r, int ql, int qr, long val){
        if(ql>r || qr<l || ql>qr) return ;
        if(ql<= l && r<= qr){
            apply(node,l,r,val);
            return;
        }
        push(node,l,r);
        int mid = l+(r-l)/2;
        rangeAdd(node*2 , l,mid,ql,qr,val);
        rangeAdd(node*2+1,mid+1, r,ql,qr,val);
        pull(node);
    }
     void pointSet(int node, int l,int r, int pos, long val){
        if(l==r){
            sum[node] = val;
            sq[node] = val * val % mod;
            laz[node] = 0;
            return ;
        }
        push(node,l,r);
        int mid = l+(r-l)/2;
        if(pos<=mid){
            pointSet(node*2,l,mid,pos,val);
        }else{
            pointSet(node*2+1,mid+1,r,pos,val);
        }
        pull(node);
    }
}