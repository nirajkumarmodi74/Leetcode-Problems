class Solution {
    public String reverseVowels(String w) {
        char[] arr = w.toCharArray();
        String vowel = "AEIOUaeiou";
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            while (s < e && vowel.indexOf(arr[s]) == -1) {
                s++;
            }
            while(s < e && vowel.indexOf(arr[e])==-1){
                e--;
            }
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
        w = new String(arr);
        return w;
    }
}