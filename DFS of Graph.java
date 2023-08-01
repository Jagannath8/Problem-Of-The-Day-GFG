class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        recursiveDFS(adj,arr,0);
        return arr;
    }
    
    public static void recursiveDFS(ArrayList<ArrayList<Integer>> adj, ArrayList arr, int row){
        int len = adj.get(row).size();
        for(int i=0; i<len; i++){
            int num = adj.get(row).get(i);
            if(!arr.contains(num)){
                arr.add(num);
                recursiveDFS(adj,arr,num);
            }
        }
    }
}
