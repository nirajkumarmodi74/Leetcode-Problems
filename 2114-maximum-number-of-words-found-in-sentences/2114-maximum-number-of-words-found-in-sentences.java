class Solution {
    public int mostWordsFound(String[] sentences) {
        int x = 0;
        for(String sen : sentences){
            // = sen.split("\\s+");
            x = Math.max(x,sen.split(" ").length);
        }
        return x;
    }
}