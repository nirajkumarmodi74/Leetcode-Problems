class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (int)Math.ceil((double)s.length()/k);
        
        String[] ans = new String[n];
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n*k;i++){
            if(i<s.length()){
                sb.append(s.charAt(i));
            }
            else{
                sb.append(fill);
            }
            if(sb.length()==k){
                ans[idx++] = sb.toString();
                sb.setLength(0);
            }
        }
        return ans;
    }
}