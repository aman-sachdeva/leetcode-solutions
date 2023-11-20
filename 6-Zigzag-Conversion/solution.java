class Solution {
    public String convert(String s, int numRows) {
        String[] ans=new String[numRows];
        if(numRows==1){
            return s;
        }
        boolean flag=false;
        int i=0;
        for(int j=0;j<s.length();j++){
            if(ans[i]==null){
                ans[i]=String.valueOf(s.charAt(j));
            }else{
            ans[i]+=s.charAt(j);
            }
        
        if(i==0 ||i==numRows-1){
            flag=!flag;
        }
        if(flag==true){
            i++;
        }else{
           i--;
         } 
        }
        String zigzag="";
        for(int k=0;k<ans.length && ans[k]!=null;k++){
            zigzag+=ans[k];
        }
        return zigzag;
    }
}