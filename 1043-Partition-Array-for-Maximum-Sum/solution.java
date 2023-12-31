class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n];

        return func(0,arr,k,dp);
    }
    public int func(int idx,int[] arr ,int k,int[] dp){
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx]!=0){
            return dp[idx];
        }
        int len=0;
        int maxans=Integer.MIN_VALUE;
        int max_arrval=Integer.MIN_VALUE;
        for(int j=idx;j<Math.min(arr.length,idx+k);j++){
            len++;
            max_arrval=Math.max(max_arrval,arr[j]);
            int sum=len*max_arrval+func(j+1,arr,k,dp);
            maxans=Math.max(maxans,sum);
        }
        dp[idx]=maxans;
        return maxans;
    }
}