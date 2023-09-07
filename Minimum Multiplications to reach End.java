class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        // Your code here
        int n=arr.length;
        int m=100000;
        int dp[]=new int[100001];
        Arrays.fill(dp,-1);
        Queue<Integer> q=new LinkedList<>();
        q.add(start%m);
        dp[start]=0;
        while(!q.isEmpty()){
            int t=q.poll();
            if(t==end)
            return dp[end];
            for(int i=0;i<n;i++){
                int p=((t%m)*(arr[i]%m))%m;
                if(dp[p]==-1){
                    dp[p]=dp[t]+1;
                    q.add(p);
                }
            }
        }
        return -1;
    }
}
