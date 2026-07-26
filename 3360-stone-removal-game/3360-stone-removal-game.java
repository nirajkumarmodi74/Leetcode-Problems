class Solution {
    public boolean canAliceWin(int n) {
        int max = 10;
        int count = 0;
        while(n>=max){
            count++;
            n-=max;
            max--;
        }
        System.out.println(count);
        return count%2!=0;
    }
}