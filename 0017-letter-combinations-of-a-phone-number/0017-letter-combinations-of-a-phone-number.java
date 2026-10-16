class Solution {
    public static void solve(String[] map, int idx, String digits, StringBuilder out, List<String> ans){
        if(idx>=digits.length()){
            ans.add(out.toString());
            return;            
        }
        int value = digits.charAt(idx)-'0';
        String mappingValue = map[value];
        for(int i=0;i<mappingValue.length();i++){
            out.append(mappingValue.charAt(i));
            solve(map,idx+1,digits,out,ans);
            out.deleteCharAt(out.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        int idx = 0;
        StringBuilder out = new StringBuilder();
        solve(map, idx,digits,out,ans);
        return ans;
    }
}