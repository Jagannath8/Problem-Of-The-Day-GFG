class Solution{
    static int hopscotch(int n, int m, int mat[][], int ty, int i, int j) 
    {
        // code here
        int ans=0;
        if(ty==0){
            if(isValid(i-1, j, n, m))
                ans+=mat[i-1][j];
                
            if(isValid(i+1, j, n, m))
                ans+=mat[i+1][j];
                
            if(isValid(i, j+1, n, m))
                ans+=mat[i][j+1];
                
            if(isValid(i, j-1, n, m))
                ans+=mat[i][j-1];
                
            if(j%2==0){
                if(isValid(i-1, j-1, n, m))
                ans+=mat[i-1][j-1];
                
                if(isValid(i-1, j+1, n, m))
                ans+=mat[i-1][j+1];
            }
            
            else{
                if(isValid(i+1, j-1, n, m))
                ans+=mat[i+1][j-1];
                
                if(isValid(i+1, j+1, n, m))
                ans+=mat[i+1][j+1];
            }
        }
        
        else{
            if(isValid(i-2, j, n, m))
                ans+=mat[i-2][j];
                
            if(isValid(i+2, j, n, m))
                ans+=mat[i+2][j];
                
            if(isValid(i, j+2, n, m))
                ans+=mat[i][j+2];
                
            if(isValid(i, j-2, n, m))
                ans+=mat[i][j-2];
                
            if(j%2==0){
                if(isValid(i+1, j-1, n, m))
                ans+=mat[i+1][j-1];
                
                if(isValid(i+1, j+1, n, m))
                ans+=mat[i+1][j+1];
                
                if(isValid(i-2, j-1, n, m))
                ans+=mat[i-2][j-1];
                
                if(isValid(i-2, j+1, n, m))
                ans+=mat[i-2][j+1];
                
                
                if(isValid(i+1, j-2, n, m))
                ans+=mat[i+1][j-2];
                
                if(isValid(i+1, j+2, n, m))
                ans+=mat[i+1][j+2];
                
                if(isValid(i-1, j-2, n, m))
                ans+=mat[i-1][j-2];
                
                if(isValid(i-1, j+2, n, m))
                ans+=mat[i-1][j+2];
            }
            
            else{
                if(isValid(i+2, j-1, n, m))
                ans+=mat[i+2][j-1];
                
                if(isValid(i+2, j+1, n, m))
                ans+=mat[i+2][j+1];
                
                if(isValid(i-1, j-1, n, m))
                ans+=mat[i-1][j-1];
                
                if(isValid(i-1, j+1, n, m))
                ans+=mat[i-1][j+1];
                
                
                if(isValid(i+1, j-2, n, m))
                ans+=mat[i+1][j-2];
                
                if(isValid(i+1, j+2, n, m))
                ans+=mat[i+1][j+2];
                
                if(isValid(i-1, j-2, n, m))
                ans+=mat[i-1][j-2];
                
                if(isValid(i-1, j+2, n, m))
                ans+=mat[i-1][j+2];
            }
        }
        
        return ans;
    }
    
    static boolean isValid(int i, int j, int n, int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
}
