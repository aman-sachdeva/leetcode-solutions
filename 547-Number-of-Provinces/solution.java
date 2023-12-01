class Solution {
    public void dfs(int node,boolean[] visit,int[][] isConnected){
        visit[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(!visit[i] && isConnected[node][i]==1){
                dfs(i,visit,isConnected);
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visit=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            
            if(!visit[i]){
                count++;
                dfs(i,visit,isConnected);
            }
        }
        return count;
    }
}