class Solution {
    public int maxVowels(String s, int k) {
        int t = 0;
        StringBuilder sb = new StringBuilder();
        String vwl = "aeiou";
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(vwl.indexOf(ch)!=-1){
                t++;
            }
            sb.append(ch);
        }
        int ans = t;
        for(int i=k;i<s.length();i++){
            char ch = s.charAt(i);
            char chdl = sb.charAt(0);
            if(vwl.indexOf(chdl)!=-1){
                
                t--;
            }
            sb.deleteCharAt(0);
            if(vwl.indexOf(ch)!=-1){
                t++;
            }
            sb.append(ch);
            ans = Math.max(t,ans);
        }
        return ans;
    }
}