class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long op1 = (long) cost1*need1 + (long)cost2*need2;
        long op2 = (long) Math.max(need1,need2)*costBoth;
        long op3 = (long)Math.min(need1,need2)*costBoth + (long)Math.max(0,need1-need2)*cost1 + (long)Math.max(0,need2-need1)*cost2;
        long ans = Math.min(op1,Math.min(op2,op3));
        return ans;
    }
}