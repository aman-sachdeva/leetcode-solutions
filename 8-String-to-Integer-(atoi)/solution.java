class Solution {
    public int myAtoi(String s) {
        int res=0;
        int x=0;
        while(x<s.length() &&s.charAt(x)==' '){
            x++;
        }if(x==s.length()){
            return 0;
        }
        int sign=1;
        if(s.charAt(x)=='-' || s.charAt(x)=='+'){
            if(s.charAt(x)=='-'){
                sign=-1;
            }else{
                sign=1;
            }
            x++;
        }
      for(int i=x;i<s.length();i++){
          if((s.charAt(i)-'0')>9 ||(s.charAt(i)-'0')<0){
              break;
          }
          if(res>Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>Integer.MAX_VALUE%10)){
              if(sign==-1){
                  return Integer.MIN_VALUE;
              }else{
                  return Integer.MAX_VALUE;
              }
          }
        res=res*10+(s.charAt(i)-'0');
      } 
      res=sign*res;
      return res; 
    }
}