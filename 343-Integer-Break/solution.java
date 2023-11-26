class Solution {
    int[] t;
    public int integerBreak(int n) {
        t = new int[59];
        Arrays.fill(t, -1);
        return solve(n);
    }
    public int solve(int n){
        if(n==1){
            return 1;
        }
        if (t[n] != -1){
            return t[n];
        }
        int res=Integer.MIN_VALUE;

        for(int i=1;i<=n-1;i++){
            int prod=i*Math.max(n-i,solve(n-i));
            res=Math.max(res,prod);
        }
        return t[n]= res;
    }
}