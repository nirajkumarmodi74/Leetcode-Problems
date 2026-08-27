class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int ext = 0;
        StringBuilder num = new StringBuilder();
        while(i>=0 && j>=0){
            int aDigit = a.charAt(i)-'0';
            int bDigit = b.charAt(j)-'0';
            int val = (aDigit+bDigit+ext)%2;
            num.append(val);
            ext = (aDigit+bDigit+ext)/2;
            i--;
            j--;
        }
        while(i>=0){
            int aDigit = a.charAt(i)-'0';
            int val = aDigit+ext;
            num.append(val%2);
            ext = val/2;
            i--;
        }
        while(j>=0){
            int bDigit = b.charAt(j)-'0';
            int val = bDigit+ext;
            // System.out.println("val"+val);
            num.append(val%2);
            ext = val/2;
            // System.out.println(ext);
            j--;
        }
        // System.out.println(ext);
        if(ext!=0){
            num.append(ext);
        }
        return num.reverse().toString();
    }
}