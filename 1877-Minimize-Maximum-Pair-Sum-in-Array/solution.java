class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int i=0;
       while(i<n/2){
        nums[i]=nums[i]+nums[n-i-1];
        i++;
       } 
       int maxval=Integer.MIN_VALUE;
       int j=0;
       while(j<n/2){
           maxval=Math.max(maxval,nums[j]);
           j++;
       }
       return maxval;
    }
}