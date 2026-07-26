class Solution {
    public boolean canAliceWin(int n) {
        int max = 10;
        boolean al=true;
        while(n>=max){
            n-=max;
            max--;
            al = !al;
        }
        // System.out.println(count);
        return !al;
    }
}