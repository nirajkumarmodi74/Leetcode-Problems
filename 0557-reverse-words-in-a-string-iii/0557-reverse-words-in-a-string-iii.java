class Solution {
    static void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--; 
        }
    }
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        for(int end = 0;end<chars.length;end++){
            if(chars[end]==' '){
                reverse(chars,start,end-1);
                start = end + 1;
            }
        }
        reverse(chars,start,chars.length-1);
        return new String(chars);
    }
}