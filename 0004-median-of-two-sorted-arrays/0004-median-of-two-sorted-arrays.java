class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int i=0;
        int j = 0;
        int idx = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[idx] = nums1[i];
                idx++;
                i++;
            }else{
                arr[idx] = nums2[j];
                idx++;
                j++;
            }
        }
        while(i<m){
            arr[idx] = nums1[i];
            i++;
            idx++;
        }
        while(j<n){
            arr[idx] = nums2[j];
            idx++;
            j++;
        }
        if(idx%2==1){
            return arr[idx/2];
        }
        double mp = arr[idx/2]+arr[(idx/2)-1];
        return mp/2; 
    }
}