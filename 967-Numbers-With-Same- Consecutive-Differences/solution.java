class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
       ArrayList<Integer> res=new ArrayList<>();
       if(n==0){
           return new int[]{0,1,2,3,4,5,6,7,8,9};
       }
       for(int i=1;i<=9;i++){
           dfs(n,k,i,0,i,res);
       } 
       int[] ans=new int[res.size()];
       for(int i=0;i<res.size();i++){
           ans[i]=res.get(i);
       }
       return ans;
    }
    public void dfs(int n,int k,int curr,int i,int prev,ArrayList<Integer>res){
        if(i==n-1){
            res.add(curr);
            return;
        }
        int next=prev+k;
        if(next<10){
            dfs(n,k,curr*10+next,i+1,next,res);
        }
        next=prev-k;
        if(next>=0 && k!=0){
            dfs(n,k,curr*10+next,i+1,next,res);
        }
        
    }
}