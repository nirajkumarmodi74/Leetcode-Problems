class Solution {
    public int numOfSubarrays(int[] arr) {
      int MOD = 1000000007;
      int n = arr.length;
      int[] prefix = new int[n];
      prefix[0] = arr[0];
      for(int i=1;i<n;i++){
        prefix[i] = prefix[i-1]+arr[i];
      }
      int cnt = 0;
      int odd = 0;
      int even = 1;
      for(int i=0;i<n;i++){
        if(prefix[i]%2==0){
            cnt = (cnt+odd)%MOD;
            even++;
        }else{
            cnt = (cnt+even)%MOD;
            odd++;
        }
      }
      return cnt;  
    }
}