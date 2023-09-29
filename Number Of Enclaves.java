class Solution {
    int temprow[]={-1,0,1,0};
    int tempcol[]={0,1,0,-1};
    public void dfs(int grid[][],int vis[][],int row,int col){
        vis[row][col]=1;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<4;i++){
            int nrow=temprow[i]+row;
            int ncol=tempcol[i]+col;
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && vis[nrow][ncol]!=1){
                dfs(grid,vis,nrow,ncol);
            }
        }
    }
     
    int numberOfEnclaves(int[][] grid) {
        // Your code here
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<n;i++){
            if(grid[0][i]==1 && vis[0][i]!=1)
                dfs(grid,vis,0,i);
            if(grid[m-1][i]==1 && vis[m-1][i]!=-1)
                dfs(grid,vis,m-1,i);
        }
        
        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && vis[i][0]!=1)
                dfs(grid,vis,i,0);   
            if(grid[i][n-1]==1 && vis[i][n-1]!=1)
                dfs(grid,vis,i,n-1);
        }
        
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0)
                    ans++;
            }
        }
        return ans;
    }
}
