class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n<=2){
            return false;
        }
        for(int i=1;i<n-1;i++){
            boolean fi = arr[i-1]%2!=0;
            boolean se = arr[i]%2!=0;
            boolean th = arr[i+1]%2!=0;
            if(fi && se && th){
                return true;
            }
        }
        return false;
    }
}