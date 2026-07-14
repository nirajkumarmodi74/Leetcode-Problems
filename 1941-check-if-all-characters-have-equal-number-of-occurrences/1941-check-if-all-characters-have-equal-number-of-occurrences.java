class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        // System.out.println(freq);
        int count = -1;
        for(int value : freq.values()){
            if(count==-1){
                count = value;
            }else if(count!=value){
                return false;
            }
        }
        return true;
    }
}