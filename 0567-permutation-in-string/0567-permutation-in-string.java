class Solution {
    static boolean compareFreq(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int windowLength = s1.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<windowLength;i++){
            char ch = s1.charAt(i);
            arr1[ch-'a']++;
        }
        int i = 0;
        for(i=0;i<windowLength;i++){
            char ch = s2.charAt(i);
            arr2[ch-'a']++;
        }
        if(compareFreq(arr1,arr2)==true){
            return true;
        }else{
            while(i<s2.length()){
                char newChar = s2.charAt(i);
                int newCharIndex = newChar-'a';
                arr2[newCharIndex]++;

                // Old char ki entry remove krna hai
                int oldCharIndex = i-windowLength;
                char oldChar = s2.charAt(oldCharIndex);
                arr2[oldChar-'a']--;
                if(compareFreq(arr1,arr2)==true){
                    return true;
                }
                i++;
            }
            return false;
        }
    }
}