class Solution {
    public boolean search(int[] nums, int t) {
        int n = nums.length, l = 0, r = n-1, p = 0;
        for(int i=1; i<n; i++){
            if(nums[i-1]>nums[i]) {
                p = i;
                break;
            }
        }
        while( l<=r ){
            int mid = (l+r)>>1;
            if(nums[mid]==t){
                return true;
            }
            if(p<=mid){
                if(nums[mid]<=t && t<= nums[r]) l = mid+1;
                else r = mid-1;
            }else{
                if(nums[l]<=t && t<=nums[mid]) r = mid-1;
                else l = mid+1;
            }
        }
        return false;
    }
}