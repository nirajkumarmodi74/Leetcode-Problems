class Solution {
    public int reverseDegree(String s) {
        int index = 1;
        int add = 0;
        for(char ch : s.toCharArray()){
            int id = ('z'-ch)+1;
            add+=(index*id);
            index++;
        } 
        return add;
    }
}