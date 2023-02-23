class Solution {
    static int mod=1000000007;
    static int path[][];
    static int uniquePaths(int r, int c, int[][] grid) {
        // code here
        path=new int[r][c];
        path[0][0]=grid[0][0]==1 ? 1 : 0;
        
        for(int i=1;i<r;i++){
            if(grid[i][0]==1)
                path[i][0]=path[i-1][0];
        }
        
        for(int i=1;i<c;i++){
            if(grid[0][i]==1)
                path[0][i]=path[0][i-1];
        }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(grid[i][j]==1)
                    path[i][j]=(path[i-1][j] % mod + path[i][j-1] % mod)%mod;
            }
        }
        return path[r-1][c-1];
    }
};
