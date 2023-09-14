class Solution{
	public int perfectSum(int arr[],int n, int sum) { 
	    // Your code goes here
	    int MOD = (int)1e9+7;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] = (dp[j] + dp[j - arr[i]]) % MOD;
            }
        }
        return dp[sum];
	} 
}
