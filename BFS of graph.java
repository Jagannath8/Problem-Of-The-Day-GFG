class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean vis[]=new boolean [V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            Integer curr = q.poll();
            bfs.add(curr);
            for(Integer n:adj.get(curr)){
                if(vis[n]==false){
                    vis[n]=true;
                    q.add(n);
                }
            }
        }
        return bfs;
    }
}
