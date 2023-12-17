class Solution {
    public String simplifyPath(String path) {
      Stack<String> st=new Stack<>();
      for(String x:path.split("/")){
          if(!st.isEmpty() && x.equals("..")){
              st.pop();
          }else if(!x.equals(".") && !x.equals("") && !x.equals("..")){
              st.push(x);
          }
      }
      StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.insert(0,"/");
            ans.insert(1,st.peek());
            st.pop();
        }
        if(ans.length()==0){
            return "/";
        }
        else{
            return ans.toString();
        }
    }
}