class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=n+m;
        int [] arr=new int[k];
        int i=0;
        int j=0;
        int cnt=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[cnt]=nums1[i++];
                cnt++;
            }else{
                arr[cnt]=nums2[j++];
                cnt++;
            }
        }
        while(i<n){
            arr[cnt]=nums1[i++];
            cnt++;
        }
        while(j<m){
         arr[cnt]=nums2[j++];
            cnt++;   
        }
        if(k%2==1){
            return arr[k/2];
        }else{
            return(double)((double)arr[k/2]+(double)arr[k/2-1])/2.0;
        }
    }
}