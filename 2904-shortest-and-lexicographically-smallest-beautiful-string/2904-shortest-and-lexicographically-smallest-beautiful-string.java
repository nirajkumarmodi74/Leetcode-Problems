class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0;
        int n = s.length();
        int cnt = 0;
        String res = "";
        for(int j=0;j<n;j++){
            if(s.charAt(j)=='1'){
                cnt++;
            }
            while(cnt>k){
                if(s.charAt(i)=='1'){
                    cnt--;
                }
                i++;
            }

            if(cnt==k){
                // remove of unnecessary part 
                while (i <= j && s.charAt(i) == '0') {
                    i++;
                }
                String curr = s.substring(i,j+1);
                // Three condn-> 
                // i) if res is empty
                //  ii) current string length is less than res string 
                // iii) if length of both string is equal then we will check lexicalography 
                if(res.equals("") || curr.length()<res.length() || (curr.length()==res.length() && curr.compareTo(res)<0)){
                    res = curr;
                }
            }
        }
        return res;
    }
}