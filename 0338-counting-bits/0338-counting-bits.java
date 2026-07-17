class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i =0;i<=n;i++){
            int sum = 0;
            int temp = i;
            while(temp>0){
                int t = (temp&1);
                sum+=t;
                temp>>=1;
            }
                // System.out.println(sum);
            arr[i]=sum;
        }
        return arr;
    }
}