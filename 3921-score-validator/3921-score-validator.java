class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;
        for(String event : events){
            if(event.equals("WD") || event.equals("NB")){
                score++;
            }else if(event.equals("W")){
                    counter++;
                if(counter>=10){
                    break;
                }
            }else{
                int t = event.charAt(0) - '0';
                score+=t;
            }
        }
        int[] arr = {score, counter};
        return arr;
    }
}