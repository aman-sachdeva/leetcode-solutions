class Solution {
    public int maxScore(String s) {
        int zero=0;
        int one=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
        }
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zero+=1;
            }
            else{
                one-=1;
            }
            res=Math.max(zero+one,res);
        }
        return res;
    }
}