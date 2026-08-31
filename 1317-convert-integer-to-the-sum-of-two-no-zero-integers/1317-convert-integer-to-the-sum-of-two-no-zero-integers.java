class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        for (int i = 1; i < n; i++) {
            int temp = i;
            boolean zeroI = true;
            boolean zeroNI = true;
            int tempu = n - i;
            while (temp > 0) {
                if (temp % 10 == 0) {
                    zeroI = false;
                }
                temp/=10;
            }
            while(tempu>0){
                if(tempu%10==0){
                    zeroNI = false;
                }
                tempu/=10;
            }
            if(zeroI && zeroNI){
                arr[0] = i;
                arr[1] = n-i;
                break;
            }
        }
        return arr;
    }
}