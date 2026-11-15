class Solution {
    public int numOfSubarrays(int[] arr) {
      int MOD = 1000000007;
      int n = arr.length;
      
      int sum = 0;
      int cnt = 0;
      int odd = 0;
      int even = 1;
      for(int i=0;i<n;i++){
        sum += arr[i];
        if(sum%2==0){
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