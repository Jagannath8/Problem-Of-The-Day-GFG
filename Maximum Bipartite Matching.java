class Solution
{
    public int maximumMatch(int[][] g)
    {
        // Code here
        int m=g.length;
        int n=g[0].length;
        int ans=fun(g,m,n);
        return ans;
    }
    
    int fun(int g[][], int m, int n){
        int match[]=new int [n];
        for(int i=0;i<n;i++)
            match[i]=-1;
        
        int res=0;
        for(int u=0;u<m;u++){
            boolean seen[]=new boolean[n];
            if(bpm(g, u, seen, match, m, n))
                res++;
        }
        return res;
    }
    
    boolean bpm(int g[][], int u, boolean seen[], int match[], int m, int n){
        for(int v=0;v<n;v++){
            if(g[u][v]==1 && !seen[v]){
                seen[v]=true;
                if(match[v]<0 || bpm(g, match[v], seen, match, m, n)){
                    match[v]=u;
                    return true;
                }
            }
        }
        return false;
    }
}
