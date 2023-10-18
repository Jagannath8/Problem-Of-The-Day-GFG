class Solution {
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        // Your code here
        List<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!isCycle(i,adj,vis))
                ans.add(i);
        }
        return ans;
    }
    
    private static boolean isCycle(int src, List<List<Integer>> adj, boolean vis[]){
        vis[src]=true;
        for(Integer it: adj.get(src)){
            if(!vis[it]){
                if(isCycle(it,adj,vis))
                    return true;
            }
            else
                return true;
        }
        vis[src]=false;
        return false;
    }
}
