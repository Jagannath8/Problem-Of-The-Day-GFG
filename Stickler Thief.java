class Solution{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n){
        // Your code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return func(0,arr,n,dp);
    }
    
    static int func(int idx,int arr[],int n,int dp[]){
        if(idx>=n)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int pick= arr[idx]+func(idx+2,arr,n,dp);
        int nonpick=func(idx+1,arr,n,dp);
        return dp[idx]=Math.max(pick,nonpick);
    }
}
