class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int vis[]=new int[leaves+1];
        for(int i=0;i<N;i++){
            int pos=frogs[i];
            if(pos<=leaves && vis[pos]==0){
                int temp=pos;
                while(temp<=leaves){
                    if(vis[temp]==0)
                        vis[temp]=1;
                    
                    temp+=pos;
                }
            }
        }
        
        int ans=0;
        for(int i=1;i<=leaves;i++){
            if(vis[i]==0)
                ans++;
        }
        
        return ans;
    }
}
