class Solution {
    public boolean isMatch(String s, String p) {
     boolean[][] dp=new boolean[p.length()+1][s.length()+1];
        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
                if(i==dp.length-1 && j==dp[0].length-1){//vedio from pepcoding;
                    dp[i][j]=true;
                }else if(i==dp.length-1){
                    dp[i][j]=false;
                }else if(j==dp[0].length-1){
                    if(p.charAt(i)=='*'){
                        dp[i][j]=dp[i+1][j];
                    }else{
                    dp[i][j]=false;}
                }else{
                    char pc=p.charAt(i);
                    char sc=s.charAt(j);
                    if(pc=='?'){
                      dp[i][j]=dp[i+1][j+1];  
                    }else if(pc=='*'){
                        dp[i][j]=dp[i+1][j] ||dp[i][j+1];
                    }else if(pc==sc){
                         dp[i][j]=dp[i+1][j+1]; 
                    }else{
                        dp[i][j]=false;
                    }
                }
            }
        }
        return dp[0][0];
    }
}