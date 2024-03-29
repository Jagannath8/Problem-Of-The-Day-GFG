class Solution {
    public static long bestNode(int N, int[] A, int[] P) {
        // code here
        Set<Integer> non_leaf=new HashSet<>();
        for(int i=0;i<N;i++)
            non_leaf.add(P[i]);
            
        ArrayList<Integer> leaf_node=new ArrayList<>();
        for(int i=1;i<=P.length;i++){
            if(!non_leaf.contains(i))
                leaf_node.add(i);
        }
        
        int ans=Integer.MIN_VALUE;
        for(int leaf: leaf_node){
            int curr=leaf;
            int sum=0;
            while(curr!=-1){
                sum=-sum;
                sum+=A[curr-1];
                ans=Math.max(ans,sum);
                curr=P[curr-1];
            }
        }
        return ans;
    }
}
