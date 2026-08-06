class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int num = n;
            int mul = 1;
            while(num>0){
                mul*=num%10;
                num/=10;
            }
            if(mul%t==0){
                return n;
            }else{
                n++;
            }
        }  
    }
}