class Solution {
    public String clearDigits(String s) {
        StringBuilder word = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                word.deleteCharAt(word.length()-1);
            }else{
                word.append(ch);
            }
        }
        return word.toString();
    }
}