class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> freq1 = new HashMap<>();
        String[] s1Word = s1.split("\\s+");
        for(String word : s1Word){
            freq1.put(word,freq1.getOrDefault(word,0)+1);
        }
        String[] s2Word = s2.split("\\s+");
        HashMap<String,Integer> freq2 = new HashMap<>();
        for(String word : s2Word){
            freq2.put(word, freq2.getOrDefault(word,0)+1);
        }
        for(String word : freq1.keySet()){
            if(freq1.get(word)==1  && !freq2.containsKey(word)){
                ans.add(word);
            }
        }
        for(String word : freq2.keySet()){
            if(freq2.get(word)==1 && !freq1.containsKey(word)){
                ans.add(word);
            }
        } 
        return ans.toArray(new String[0]);
    }
}