class Solution
{
    int mod=1000000007;
    int dp[]=new int[10001];
    public int CountWays(String str)
    {
        // code here
        Arrays.fill(dp,-1);
        if(str.charAt(0)=='0')
            return 0;
        
        int n=str.length();
        return solve(str,n);
    }
    
    int solve(String str, int n){
        if(n==0 || n==1)
            return 1;
        
        if(dp[n]!=-1)
            return dp[n];
            
        int count=0;
        if(str.charAt(n-1)>'0')
            count=solve(str, n-1);
        
        if(str.charAt(n-2)=='1'|| str.charAt(n-2)=='2' && str.charAt(n-1)<'7')
            count=(count+solve(str, n-2)%mod)%mod;
            
        return dp[n]=count;
    }
}
