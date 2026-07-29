class Solution {
    public int mostWordsFound(String[] sentences) {
        int x = 0;
        for(String sen : sentences){
            String[] w = sen.split("\\s+");
            x = Math.max(x,w.length);
        }
        return x;
    }
}