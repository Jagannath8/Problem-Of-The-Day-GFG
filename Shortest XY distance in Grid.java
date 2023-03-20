class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int n, int m) {
        //code here
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=Integer.MAX_VALUE-1;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid.get(i).get(j)=='X')
                    dist[i][j]=0;
                
                else{
                    if (i-1 >= 0)  
                        dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
                    if(j+1<m)
                         dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
                    if(i+1<n)
                         dist[i][j] = Math.min(dist[i][j], dist[i+1][j] + 1);
                    if (j-1>=0) 
                        dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
                }
            }
        }
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(grid.get(i).get(j)=='X')
                    dist[i][j]=0;
                
                else{
                    if (i-1 >= 0)  
                        dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
                    if(j+1<m)
                         dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
                    if(i+1<n)
                         dist[i][j] = Math.min(dist[i][j], dist[i+1][j] + 1);
                    if (j-1>=0) 
                        dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
                }
            }
        }
        
        int ans = Integer.MAX_VALUE-1;

        for (int i=0; i<n;i++) {
            for (int j=0; j<m;j++) {
                if(grid.get(i).get(j)=='Y') 
                    ans=Math.min(ans, dist[i][j]);
            }
        }

        return ans;
    }
};
