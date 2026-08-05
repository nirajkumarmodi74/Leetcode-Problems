class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();

        StringBuilder hasAlphabet = new StringBuilder();
        StringBuilder hasSpecial = new StringBuilder();
        for(char ch : arr){
            if(Character.isLetter(ch)){
                hasAlphabet.append(ch);
            }else{
                hasSpecial.append(ch);
            }
        }
        int alpha = hasAlphabet.length()-1;
        int special = hasSpecial.length()-1;

        for(int i=0;i<arr.length;i++){
            if(Character.isLetter(arr[i])){
                arr[i] = hasAlphabet.charAt(alpha--);
            }else{
                arr[i] = hasSpecial.charAt(special--);
            }
        }
        return new String(arr);
    }
}