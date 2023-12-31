class Solution {
    public static boolean isPossible(int n, int[] coins) {
        // code here
        return helper(0,n,coins,0);
    }
    
    private static boolean helper(int i, int n, int coins[], int sum){
        if(sum!=0 && (sum%2024==0 || sum%20==0 || sum%24==0))
            return true;
        if(i==n)
            return false;
        return helper(i+1, n, coins, sum+coins[i]) || helper(i+1, n, coins, sum);
    }
}
