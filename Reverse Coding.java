class Solution {
    static int sumOfNaturals(int n) {
        // code here
        long num=0;
        for(int i=1;i<=n;i++){
            num+=i;
        }
        int mod=(int)Math.pow(10,9)+7;
        return(int)(num%mod);
    }
};
