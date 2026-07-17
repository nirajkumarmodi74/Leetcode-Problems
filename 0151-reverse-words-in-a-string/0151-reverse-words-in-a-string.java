class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        StringBuilder w = new StringBuilder();
        for(int i = word.length-1;i>=0;i--){
            w.append(word[i]);
            if(i!=0){
                w.append(" ");
            }
        }
        return w.toString();
    }
}