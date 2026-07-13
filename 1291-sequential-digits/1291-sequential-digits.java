class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> ans = new ArrayList<>();

        for(int i = 2;i<=9;i++){
            for(int j=0;j+i<=9;j++){
                int num = Integer.parseInt(digits.substring(j,j+i));

                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}