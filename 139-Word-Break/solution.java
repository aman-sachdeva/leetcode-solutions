class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       HashSet<String> set=new HashSet<>();
       set.addAll(wordDict);
       return function(s,set);
    }
    public boolean function(String s,HashSet<String> set){
        int[] dp=new int[s.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<i+1;j++){
                String check=s.substring(j,i+1);
                if(set.contains(check)){
                    if(j>0){
                        dp[i]+=dp[j-1];
                    }else{
                        dp[i]+=1;
                    }
                }
            }
        }
        if(dp[s.length()-1]>0){
            return true;
        }else{
            return false;
        }
    }
}