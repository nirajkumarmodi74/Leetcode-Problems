class Solution {
    public int minInsertions(String s) {
        int res = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(ans%2==1){
                    res++;
                    ans--;
                }
                ans+=2;
            }else{
                ans--;
                if(ans<0){
                    ans = 1;
                    res++;
                }
            }
        }
        return res+ans;
    }
}