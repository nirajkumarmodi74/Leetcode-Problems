class Solution {
    public int compress(char[] chars) {
        int readIndex = 0;
        int index = 0;
        while(readIndex<chars.length){
            char currentChar = chars[readIndex];
            int cnt = 0;
            // Counting Similar character
            while(readIndex<chars.length && currentChar==chars[readIndex]){
                readIndex++;
                cnt++;
            }
            // store character in array
            chars[index++] = currentChar;
            // if count of a character > 1
            if(cnt>1){
                // digit to string
                String w = String.valueOf(cnt);
                for(char digit : w.toCharArray()){
                    chars[index++] = digit;
                }
            }
        }
        return index;
    }
}