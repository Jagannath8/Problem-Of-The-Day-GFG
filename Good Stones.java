class Solution {
    static int dp[];
    public static int goodStones(int n, int[] arr) {
        // code here
        dp=new int[n];
        for(int i=0;i<n;i++){
            if(dp[i]==0)
                dp[i]=solve(arr, n, i);
        }
        
        int ans=0;
        for(int x: dp){
            if(x==2)
                ans++;
        }
        
        return ans;
    }
    
    static int solve(int arr[], int n, int m){
        if(m<0 || m>=n)
            return 2;
        
        if(dp[m]==1 || dp[m]==2)
            return dp[m];
        
        dp[m]=1;
        return dp[m]=solve(arr, n, m+arr[m]);
    }
}
