class Solution {
    
    final int mod = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp=new int[n+1][target+1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return solve(n,k,target,dp);
        
    }
    public int solve(int n,int k,int target,int[][] dp){
        if(target<0){
            return 0;
        }
        if(target==0 && n!=0){
            return 0;
        }if(n==0 && target!=0){
            return 0;
        }if(n==0 && target==0){
            return 1;
        }if (dp[n][target] != -1){
            return dp[n][target];
        }
    int ans=0;
    for (int i = 1; i <= k; i++) {
            ans =( ans + solve( n - 1, k, target - i,dp))%mod;
        }
        return dp[n][target]=ans;
        
    }
}