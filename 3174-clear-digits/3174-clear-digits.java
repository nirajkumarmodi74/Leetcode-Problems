class Solution {
    public String clearDigits(String s) {
        Stack<Character> w = new Stack<>();
        for(char ch : s.toCharArray()){
            int t = ch - '0';
            if(t>=0 && t<=9){
                w.pop();
            }else{
                w.push(ch);
            }
        }
        StringBuilder word = new StringBuilder();
        for(char ch : w){
            word.append(ch);
        }
        return word.toString();
    }
}