class Solution {
    static void backtrack(List<String> res,StringBuilder sb, int s, int e, int n){
        if(s==n && e==n){
            res.add(sb.toString());
            return;
        }
        if(s<n){
            sb.append('(');
            backtrack(res,sb,s+1,e,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(e<s){
            sb.append(')');
            backtrack(res,sb,s,e+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(res, sb,0,0,n);
        return res;
    }
}