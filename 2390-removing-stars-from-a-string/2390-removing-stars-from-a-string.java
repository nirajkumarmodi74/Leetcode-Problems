class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                res.deleteCharAt(res.length()-1);
            }else{
                res.append(ch);
            }
        }
        System.out.println(res);
        return res.toString();
    }
}