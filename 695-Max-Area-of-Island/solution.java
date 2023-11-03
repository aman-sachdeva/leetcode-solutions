class Solution {
    public int maxAreaOfIsland(int[][] grid) {
     int n=grid.length;
     int m=grid[0].length;
     if(n==1 && m==1 &&grid[0][0]==1){
         return 1;
     }
     int[] drow={-1,0,1,0};
     int[] dcol={0,+1,0,-1};
     int [][] visit=new int[n][m];
     int maxans=0;
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             int[] count =new int[1];
             
            if(visit[i][j]==0 &&grid[i][j]==1){
                count[0]=1;
                visit[i][j]=1;
                dfs(i,j,grid,visit,count,drow,dcol);
                maxans=Math.max(maxans,count[0]);
            }
         }
     }   
     return maxans;
    }
    public void dfs(int row,int col,int[][]grid,int[][] visit,int[] count,int[] drow,int[] dcol){
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && visit[nrow][ncol]==0){
                visit[nrow][ncol]=1;
                count[0]=count[0]+1;
                dfs(nrow,ncol,grid,visit,count,drow,dcol);
            }
        }

    }
}