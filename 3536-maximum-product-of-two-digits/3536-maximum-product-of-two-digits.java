class Solution {
    public int maxProduct(int n) {
        int[] arr = new int[10];
        int temp = n;
        while(temp>0){
            int d = temp %10;
            arr[d]++;
            temp/=10;
        }
        int mul =1;
        int count = 0;
        for(int i = 9;i>=0;i--){
            while(arr[i]>0 && count < 2){
                mul*=i;
                arr[i]--;
                count++;
            }
        }
        System.out.println(mul);
        return mul;
    }
}