class Node{
    int v; int w;
    Node(int v, int w){
        this.v =v; this.w = w;
    }
}

class Solution {
    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
        // code here
        List<List<Node>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> curved = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> arr : edges){
            adj.get(arr.get(0)).add(new Node(arr.get(1), arr.get(2)));
            adj.get(arr.get(1)).add(new Node(arr.get(0), arr.get(2)));

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr.get(0));  
            temp.add(arr.get(1));  
            temp.add(arr.get(3));
            curved.add(temp);
        }
        
        int disa[] = dijkstra(adj, a, n);
        int disb[] = dijkstra(adj, b, n);

        int ans = disa[b];
        for(int i=0; i<m; i++){
            int u = curved.get(i).get(0);
            int v = curved.get(i).get(1);
            int cw = curved.get(i).get(2);

            ans = Math.min(ans, cw + disa[u] + disb[v]);
            ans = Math.min(ans, cw + disa[v]  + disb[u]);
        }
          
         if(ans>=1000000001) return -1;
		 return ans;
    }
    
    static int[] dijkstra(List<List<Node>> adj , int start, int n){
        int dis[] = new int[n+1];
        Arrays.fill(dis, 1000000001);

        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> { return x.w - y.w; }); 


        dis[start]=0;

        pq.add(new Node(start,0)); 

        while(!pq.isEmpty())
        {
            Node curr_node =pq.poll();  
            for(Node nei : adj.get(curr_node.v))  {
                if(dis[nei.v] > dis[curr_node.v] + nei.w){
                    dis[nei.v] = dis[curr_node.v] + nei.w;
                    pq.add(new Node(nei.v , dis[nei.v])); 
                }   
            }
        }
        return dis;
    }
};
