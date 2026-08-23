class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int extra = Math.min((mainTank-1)/4, additionalTank);

        
        return (mainTank + extra)*10;
    }
}