class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        if(s==e){
            return nums[0];
        }
        while(s<=e){
            int mid = s + (e-s)/2;
            int currentElem = nums[mid];
            int prevElem = -1;
            if(mid-1>=0){
                prevElem = nums[mid-1];
            }
            int nextElem = -1;
            if(mid+1<nums.length){
                nextElem = nums[mid+1];
            }
            if(currentElem!=prevElem  && currentElem!=nextElem){
                return currentElem;
            }
            if(currentElem!=prevElem && currentElem==nextElem){
                if((mid&1)==1){
                    e = mid-1;
                }else{
                    s = mid +1;
                }
            }
            if(currentElem==prevElem && currentElem!=nextElem){
                if((mid&1)==1){
                    s = mid +1;
                }else{
                    e = mid -1;
                }
            }
        }
        return -1;
    }
}