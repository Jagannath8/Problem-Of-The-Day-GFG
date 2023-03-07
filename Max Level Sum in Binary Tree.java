class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        int ans=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int n=q.size();
            int sum=0;
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                sum+=curr.data;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}
