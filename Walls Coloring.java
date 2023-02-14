class Solution{
	int minCost(int [][] col, int n){
        //Write your code here
        int dp[][]=new int[n][3];
        dp[0][0]=col[0][0];
        dp[0][1]=col[0][1];
        dp[0][2]=col[0][2];
        
        for(int i=1;i<n;i++){
            dp[i][0] = col[i][0]+Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = col[i][1]+Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = col[i][2]+Math.min(dp[i-1][0], dp[i-1][1]);
        }
        
        return Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);
    }
}
