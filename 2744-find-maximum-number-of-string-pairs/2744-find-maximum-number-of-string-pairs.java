class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> s = new HashSet<>(Arrays.asList(words));

        int count = 0;
        
        for(String word : words){
            if(!s.contains(word)){
                continue;
            }

            String rev = new StringBuilder(word).reverse().toString();

            if(!word.equals(rev) && s.contains(rev)){
                count++;
                s.remove(word);
                s.remove(rev);
            }
        }
        return count;
    }
}