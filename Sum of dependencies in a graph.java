class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        int sum=0;
        for(int i=0;i<V;i++){
            sum+=adj.get(i).size();
        }
        return sum;
    }
};
