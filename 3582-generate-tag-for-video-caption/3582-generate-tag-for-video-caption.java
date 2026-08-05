class Solution {
    public String generateTag(String caption) {
        StringBuilder word = new StringBuilder();
        word.append("#");
        caption = caption.trim();
        boolean capital = false;
        for(int i=0;i<caption.length() && word.length()<100;i++){
            char ch = caption.charAt(i);

            if(ch==' '){
                capital = true;
                continue;
            }
            if(capital){
                word.append(Character.toUpperCase(ch));
                capital = false;
            }
            else{
                word.append(Character.toLowerCase(ch));
            }
        }
        return word.toString();
    }
}