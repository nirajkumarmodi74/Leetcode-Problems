class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder st = new StringBuilder(s);
        while(st.length()>2){
            StringBuilder next = new StringBuilder();
            for(int i=1;i<st.length();i++){
                 int num =((st.charAt(i) -'0') +(st.charAt(i-1)-'0'))%10;
                 next.append(num);
            }
            st.setLength(0);
                
            st.append(next);
            System.out.println(st);
        }
        if(st.length()<2){
            return true;
        }
        return st.charAt(0)==st.charAt(1);
    }
}