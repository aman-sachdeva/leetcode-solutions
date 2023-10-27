class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int arrsum=0;
        int tempmaxsum=0;
        int tempminsum=0;
        for(int i=0;i<n;i++){
            arrsum+=nums[i];
            tempmaxsum+=nums[i];
            if(maxsum<tempmaxsum){
                maxsum=tempmaxsum;
            }if(tempmaxsum<0){
                tempmaxsum=0;
            }
            tempminsum+=nums[i];
            if(minsum>tempminsum){
                minsum=tempminsum;
            }if(tempminsum>0){
                tempminsum=0;
            }
        }
        if(arrsum==minsum){
            return maxsum;
        }else{
            return Math.max(maxsum,arrsum-minsum);
        }
    }
}