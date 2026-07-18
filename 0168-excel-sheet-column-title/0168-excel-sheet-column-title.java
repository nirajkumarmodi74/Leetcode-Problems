class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder w = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char ch = (char)('A' + columnNumber%26);
            w.append(ch);
            columnNumber/=26;
        }
        // System.out.println(w.reverse());
        return w.reverse().toString();
    }
}