class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        // code here
        int n=0;
        for(Long x:query){
            n=Math.max(n,(int)Math.sqrt(x));
        }
        
        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i<=n;i++){
            if(prime[i]){
                for(int j=i+i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        
        int dp[]=new int[n+1];
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1];
            if(prime[i])
                dp[i]++;
        }
        
        ArrayList<Integer> count=new ArrayList<>();
        for(Long x:query){
            int root=(int)Math.sqrt(x);
            count.add(dp[root]);
        }
        
        return count;
    }
}
