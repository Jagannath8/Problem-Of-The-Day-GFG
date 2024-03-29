class Solution {
    int mod = 1000000007; 
    int dp[][][];
    public int countWaystoDivide(int n, int k) {
        // Code here
        dp = new int[n+1][k+1][n+1];
        for(int x[][]:dp){
           for(int y[] :x)
           Arrays.fill(y,-1);
       }
    
        return solve(n, k, n);
    }
    
    int solve(int n, int k, int last){
    	if (k == 0)
    		return (n==0)? 1:0;
    	
    	if (dp[n][k][last] != -1)
    		return dp[n][k][last];
    	int answer = 0;
    
    	for (int s = 1; s <= Math.min(n, last); s++){
    		answer += solve(n - s, k - 1, s);
    		answer = answer % mod;
    	}
    
    	return dp[n][k][last] = answer;
    }
}
