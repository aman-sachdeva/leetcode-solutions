class Solution {
    public boolean solve(int n,int x){
        if(n==0){
            return true;
        }
        while(x<=n){
            if(solve(n-x,x*3)==true){
                return true;
            }
            x=x*3;

        }
        return false;
    }
    public boolean checkPowersOfThree(int n) {
        int x=1;
        return solve(n,x);
    }
}