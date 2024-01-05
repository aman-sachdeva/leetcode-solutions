class Solution {
    public int lengthOfLIS(int[] nums) {
       int[] dp=new int[nums.length];
        dp[0]=1;
        int res=0;
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
            }
        
        dp[i]=max+1;
            if(dp[i]>res){
                res=dp[i];
            }
        }
        if(nums.length==1){
            return 1;
        }
        return res;
    }
}