class Solution {
    public int countHomogenous(String s) {
        int mod=1000000000+7;
        int ans=s.length();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                ans=(ans+(count)%mod)%mod;
                count++;
            }else{
                count=1;
            }
        }
     return ans;
    }
}