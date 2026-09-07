class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt = 0;
        for(int i = left;i<=right;i++){
            String word = words[i];
            int n = word.length()-1;
            String vowel = "aeiou";
            if(vowel.indexOf(word.charAt(0))!=-1 && vowel.indexOf(word.charAt(n))!=-1){
                cnt++;
            }
        }
        return cnt;
    }
}