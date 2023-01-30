class Solution{
    public int countVertex(int n, int[][] edges){
        // code here
        ArrayList<Integer> adj[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            adj[i]=new ArrayList<>();
        }
        
        for(int i=0;i<n-1;i++){
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }
        
        int [][]val=new int [n+1][2];
        for(int i=1;i<=n;i++)
            val[i][1]=1;
            
        dfs(adj, 1, 1, val);
        return Math.min(val[1][0], val[1][1]);
    }
    
    public void dfs(ArrayList<Integer> adj[], int src, int par, int val[][]){
        for(Integer v: adj[src]){
            if(v!=par)
                dfs(adj, v, src, val);
        }
        
        for(Integer v: adj[src]){
            if(v!=par){
                val[src][0]+=val[v][1];
                val[src][1]+=Math.min(val[v][1], val[v][0]);
            }
        }
    }
}
