class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int empty = numBottles;

        while(empty>=numExchange){
            int newBottle = empty/numExchange;
            sum+=newBottle;
            empty = (empty%numExchange) + newBottle;
        }
        return sum;
    }
}