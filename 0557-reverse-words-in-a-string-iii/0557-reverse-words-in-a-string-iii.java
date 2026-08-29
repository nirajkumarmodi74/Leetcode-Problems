class Solution {

    public String reverseWords(String s) {
        String[] word = s.split("\\s");
        StringBuilder words = new StringBuilder();
        for(String w : word){
            words.append(new StringBuilder(w).reverse());
            words.append(" ");
        }
        return words.toString().trim();
    }
}