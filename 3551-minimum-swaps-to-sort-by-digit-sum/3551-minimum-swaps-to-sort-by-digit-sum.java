class Solution {
    static int digitSum(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a,b)->{
            int sumA = digitSum(a);
            int sumB = digitSum(b);
            if(sumA != sumB){
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a,b);
        });
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<n;i++){
            map.put(nums[i],i);
        }
        int swap = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == arr[i]){
                continue;
            }
            int idx = map.get(arr[i]);
            int temp  = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            map.put(nums[idx],idx);
            map.put(nums[i],i);
            swap++;
        }
        return swap;
    }
}