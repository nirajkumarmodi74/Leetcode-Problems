class Solution {
    public int vowelConsonantScore(String s) {
        int c = 0;
        int v = 0;
        String str = "aeiou";
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                if(str.indexOf(ch)!=-1){
                    v++;
                }else{
                    c++;
                }
            }
        }
        if(c==0){
            return 0;
        }
        return v/c;
    }
}