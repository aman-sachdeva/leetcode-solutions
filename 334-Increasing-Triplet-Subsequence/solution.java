class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int i=Integer.MAX_VALUE;
        int j=Integer.MAX_VALUE;
        for(int x=0;x<nums.length;x++){
            if(nums[x]<=i){
                i=nums[x];
            }else if(nums[x]<=j){
                j=nums[x];
            }else{
                return true;
            }
        }
        return false;
    }
}
