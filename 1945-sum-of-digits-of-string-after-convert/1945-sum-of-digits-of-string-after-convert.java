class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for(char ch : s.toCharArray()){
            int val = (ch - 'a')+1;
            num.append(val);
        }
        while(k>0){
            int sum = 0;
            for(int i=0;i<num.length();i++){
                sum+=num.charAt(i)-'0';
                System.out.println(sum);
            }
            num = new StringBuilder(String.valueOf(sum));
            k--;
        }
        return Integer.parseInt(num.toString());
    }
}