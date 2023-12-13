class Solution {
    long countStrings(int n) {
        // code here
        long mod=1000000007;
        if(n==1)
            return 2;
        long a=2, b=3, c=0;
        for(int i=3;i<=n;i++){
            c=(a+b)%mod;
            a=b;
            b=c;
        }
        return b%mod;
    }
}
