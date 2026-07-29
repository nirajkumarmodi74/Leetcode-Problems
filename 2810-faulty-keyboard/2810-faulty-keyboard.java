class Solution {
    public String finalString(String s) {
        StringBuilder word = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='i'){
                word.reverse();
            }else{
                word.append(ch);
            }
        }
        return word.toString();
    }
}