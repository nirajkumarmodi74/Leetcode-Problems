class Solution {
    static int maxm(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max<i){
                max = i;
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = maxm(candies);
        for(int  i : candies){
            if(i+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}