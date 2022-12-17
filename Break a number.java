class Solution{
    long waysToBreakNumber(long N){
        // code here
        long mod=1000000007;
        return ((N+1)*(N+2)/2)%mod;
    }
}
