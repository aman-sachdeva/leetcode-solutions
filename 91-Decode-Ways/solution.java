class Solution {
    public int numDecodings(String s) {
     int[] dp=new int[s.length()];
     if(s.charAt(0)=='0'){
     dp[0]=0;
     }else{
         dp[0]=1;
     }

     for(int i=1;i<s.length();i++){
         if(s.charAt(i-1)=='0' && s.charAt(i)=='0'){
             dp[i]=0;
         }else if(s.charAt(i-1)=='0' && s.charAt(i)!='0'){
             if(i>=2){
             dp[i]=dp[i-1];
             }else{
                 dp[i]=0;
             }
         }else if(s.charAt(i-1)!='0' && s.charAt(i)=='0'){
             if(s.charAt(i-1)=='2' ||s.charAt(i-1)=='1'){
                 if(i>=2){
                 dp[i]=dp[i-2];
                 }else{
                     dp[i]=1;
                 }
             }else{
                 dp[i]=0;
             }
         }
         else{
             if(Integer.parseInt(s.substring(i-1,i+1))<=26){
                 if(i>=2){
                     dp[i]=dp[i-2]+dp[i-1];
                 }else{
                     dp[i]=dp[i-1]+1;
                 }
             }else{
                 dp[i]=dp[i-1];
             }
         }
     }
     return dp[s.length()-1];
    }
}