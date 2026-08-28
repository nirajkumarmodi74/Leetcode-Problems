class Solution {
    static boolean selfDiv(int i){
        int num = i;
        
        while(num>0){
            int d = num%10;
            if(d==0){
                return false;
            }
            if(d!=0 && i%d!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans  = new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean val = selfDiv(i);
            if(val){
                ans.add(i);
            }
        }
        return ans;
    }
}