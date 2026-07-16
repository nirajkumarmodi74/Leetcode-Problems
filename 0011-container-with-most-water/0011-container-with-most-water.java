class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxWater  = 0;
        while(i<j){
            int minHeight = Math.min(height[i],height[j]);
            maxWater = Math.max(maxWater,(minHeight*(j-i)));
            while(i<j && height[i]<=minHeight)i++;
            while(i<j && height[j]<=minHeight)j--;
        }
        return maxWater;
    }
}