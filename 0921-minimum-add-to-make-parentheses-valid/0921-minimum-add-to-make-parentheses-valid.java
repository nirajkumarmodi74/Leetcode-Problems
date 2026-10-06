class Solution {
    public int minAddToMakeValid(String s) {
        int dep = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        System.out.println(st);
        return st.size();
    }
}