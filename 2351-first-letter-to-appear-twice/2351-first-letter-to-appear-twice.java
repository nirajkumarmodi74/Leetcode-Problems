class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char c = 'a';
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return c;
    }
}