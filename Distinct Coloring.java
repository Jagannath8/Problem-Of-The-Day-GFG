class Solution{
    public static long distinctColoring(int n, int[]r, int[]g, int[]b){
        //code here
        long dp[][]=new long[n][3];
        dp[0][0]=r[0];
        dp[0][1]=g[0];
        dp[0][2]=b[0];;
        
        for(int i=1;i<n;i++){
            dp[i][0]=r[i]+Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1]=g[i]+Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2]=b[i]+Math.min(dp[i-1][0], dp[i-1][1]);
        }
        
        return Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);
    }
}
